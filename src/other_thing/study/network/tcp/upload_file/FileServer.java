package other_thing.study.network.tcp.upload_file;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author PlagueWZK
 * description: FileServer
 * date: 2024/12/29 13:49
 */

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);


        String destFilePath = "src/other_thing/study/network/tcp/upload_file/dest.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);
        bos.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("File received successfully");
        bw.flush();
        socket.shutdownOutput();

        bis.close();
        bw.close();
        socket.close();
        serverSocket.close();
    }
}
