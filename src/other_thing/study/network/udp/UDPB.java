package other_thing.study.network.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author PlagueWZK
 * description: UDPB
 * date: 2024/12/29 15:17
 */

public class UDPB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket  =  new DatagramSocket(9992);
        System.out.println("9992端口监听成功");

        byte[] data = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
        socket.receive(datagramPacket);
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

        byte[] bytes = "也行，哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈".getBytes();
        socket.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("10.22.71.140"), 9991));
        socket.close();
    }
}
