package other_thing.study.network.tcp.upload_file;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author PlagueWZK
 * description: FileClient
 * date: 2024/12/29 13:50
 */

public class FileClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        String path = "src/other_thing/study/network/tcp/upload_file/file.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        byte[] file = StreamUtils.streamToByteArray(bis);
        bis.close();

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(file);
        socket.shutdownOutput();


        String msg = StreamUtils.streamToString(socket.getInputStream());
        System.out.println(msg);

        bos.close();
        socket.close();
    }
}
