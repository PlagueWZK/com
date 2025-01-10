package other_thing.study.IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Properties;

/**
 * @Description: Print_
 * @Author: 王政凯
 * @Date: 2024 下午9:12
 */

public class Print_ {
    public static void main(String[] args) throws IOException {
        //打印流只有输出流，没有输入流，分为字节流和字符流
        byte[] bytes = "曲阜师范大学".getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        PrintStream printStream = new PrintStream(System.out);
        printStream.println("你好");
        printStream.write(bytes);
        //修改输出位置，默认为输出到控制台
        System.setOut(new PrintStream("src\\other_thing\\study\\IOStream\\out.txt"));
        System.out.println("你好");

        PrintWriter pw = new PrintWriter(System.out);
        pw.print("你好");
        pw = new PrintWriter(new FileWriter("src\\other_thing\\study\\IOStream\\out.txt"));
        pw.print("北京欢迎你");
        pw.close();
    }
}
