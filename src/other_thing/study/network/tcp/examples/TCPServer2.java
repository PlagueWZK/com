package other_thing.study.network.tcp.examples;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author PlagueWZK
 * description: TCPServer2
 * date: 2024/12/29 01:48
 */

public class TCPServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        System.out.println(s);

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("Server: hello,client");
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
        socket.close();
        serverSocket.close();
    }
}
