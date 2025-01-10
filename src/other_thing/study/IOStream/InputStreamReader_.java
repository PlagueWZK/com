package other_thing.study.IOStream;

import java.io.*;

/**
 * @Description: InputStreamReader_
 * @Author: 王政凯
 * @Date: 2024 下午8:53
 */

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //InputStreamReader对象用于将字节流转换为字符流，并且可以指定字符编码，可以防止乱码问题
        //在测试时可以将后边的字符编码改为UTF-8进行测试
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                "src\\other_thing\\study\\IOStream\\InSRtest.txt"), "UTF-8"));

        while (br.ready()) {
            System.out.println(br.readLine());
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\other_thing\\study\\IOStream\\InSRtest.txt",true), "UTF-8"));
        bw.write("你好");
        bw.close();
    }
}
