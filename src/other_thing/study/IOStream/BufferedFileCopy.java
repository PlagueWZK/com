package other_thing.study.IOStream;

import java.io.*;

/**
 * @Description: BufferedFileCopy
 * @Author: 王政凯
 * @Date: 2024 下午3:44
 */

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException{
        copy();
    }
    //字符流
    //不可以Copy二进制文件，如视频音乐等
    public static void copy() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\other_thing\\study\\IOStream\\t2.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\other_thing\\study\\IOStream\\t2Copy.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
    //字节流
    //可以Copy二进制文件
    public static void copy2() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\other_thing\\study\\IOStream\\t2.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\other_thing\\study\\IOStream\\t2Copy.txt"));
        byte[] bytes = new byte[1024];
        int readLen;
        while ((readLen = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, readLen);
        }
        bufferedOutputStream.close();
    }
}
