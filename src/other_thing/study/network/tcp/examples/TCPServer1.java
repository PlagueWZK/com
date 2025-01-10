package other_thing.study.network.tcp.examples;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author PlagueWZK
 * description: Server
 * date: 2024/12/29 00:43
 */

public class TCPServer1 {
    public static void main(String[] args) throws IOException {
        //在本机9999端口监听，等待连接
        //要求主机没有其他服务占用端口（即监听）
        //ServerSocket:监听端口,可以通过accept方法返回多个Socket对象（多客户端连接服务端的多并发）
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端已启动，等待连接...");
        //当没有客户端连接时，程序阻塞，等待连接
        // 如果有客户端连接，则返回Socket对象, 程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端：客户端连接成功！--" + socket.getClass());

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        OutputStream os = socket.getOutputStream();
        os.write("hello,client".getBytes());
        socket.shutdownOutput();
        os.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
