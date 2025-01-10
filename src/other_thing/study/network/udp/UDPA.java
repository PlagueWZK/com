package other_thing.study.network.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author PlagueWZK
 * description: UDPA
 * date: 2024/12/29 15:17
 */

public class UDPA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9991);
        byte[] data = "明天吃点好的".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.22.71.140"), 9992);
        socket.send(packet);
        DatagramPacket d;
        socket.receive(d = new DatagramPacket(new byte[1024], 1024));
        System.out.println(new String(d.getData(), 0, d.getLength()));
        socket.close();
    }
}
