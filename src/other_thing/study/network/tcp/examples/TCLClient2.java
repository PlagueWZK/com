package other_thing.study.network.tcp.examples;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author PlagueWZK
 * description: TCLClient2
 * date: 2024/12/29 01:48
 */

public class TCLClient2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("Client: hello,Server");
        bw.newLine();
        bw.flush();

        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String ss = br.readLine();
        System.out.println(ss);

        bw.close();
        br.close();
        socket.close();

    }
}
