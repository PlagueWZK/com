package other_thing.study.IOStream;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Description: FileOutPutStream_
 * @Author: 王政凯
 * @Date: 2024 下午2:55
 */

public class FileOutPutStream_ {
    public static void main(String[] args) throws IOException{
        outPutFile();
    }

    public static void creatFile() throws IOException {
        File file = new File("src\\other_thing\\study\\IOStream\\t.txt");
        file.createNewFile();
    }
    public static void outPutFile() throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("src\\other_thing\\study\\IOStream\\t.txt");
        fileOutputStream.write('H');
        //int形参代表某字符的ASCII码
        String s = "\nHello,World!";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.write(s.getBytes(),0,s.length()-1);
    }
    public static void outPutFile2() throws IOException {
        //此创建方式会使写入文件时在文件末尾追加而不是覆盖(上面的对象是覆盖原文件)
        FileOutputStream fileOutputStream = new FileOutputStream("src\\other_thing\\study\\IOStream\\t.txt",true);
        //...
    }
}
