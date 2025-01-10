package other_thing.study.network.InetAds;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author PlagueWZK
 * description: API_
 * date: 2024/12/28 23:52
 */

public class API_ {
    public static void main(String[] args) throws UnknownHostException {


        //获取本机InetAddress对象
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address); //Z8D6/26.227.51.139

        //根据主机名获取对象
        InetAddress host1 = InetAddress.getByName("Z8D6");
        System.out.println(host1);

        //根据IP地址(域名)获取对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);//www.baidu.com/110.242.68.3 IP不一定不变，根据百度调控

        //通过InetAddress对象获取对应的IP地址或者主机名
        String host2Address = host2.getHostAddress();
        System.out.println(host2Address);
        String host2HostName = host2.getHostName();
        System.out.println(host2HostName);
    }

}
