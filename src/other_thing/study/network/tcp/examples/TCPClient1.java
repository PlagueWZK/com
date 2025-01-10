package other_thing.study.network.tcp.examples;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author PlagueWZK
 * description: TCPClient1
 * date: 2024/12/29 01:01
 */

public class TCPClient1 {
    public static void main(String[] args) throws IOException {
        //连接服务端（ip，端口）  连接本机9999端口
        // 如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端：客户端连接成功！--" + socket.getClass());

        OutputStream os = socket.getOutputStream();
        os.write("hello,Server".getBytes());
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        os.close();
        socket.close();
    }
}
