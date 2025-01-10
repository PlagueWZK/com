package other_thing.study.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description: FileCopy
 * @Author: 王政凯
 * @Date: 2024 下午3:31
 */

public class FileCopy {
    public static void main(String[] args) throws IOException {
        copy();
    }
    public static void copy() throws IOException {
        String srcPath = "src\\other_thing\\study\\IOStream\\t_src.gif";
        String desPath = "src\\other_thing\\study\\IOStream\\t_copy.gif";
        FileInputStream fileInputStream = new FileInputStream(srcPath);
        FileOutputStream fileOutputStream = new FileOutputStream(desPath);
        byte[] b = new byte[1024];
        int count = 0,readLen;

        while ((readLen = fileInputStream.read(b)) != -1) {
            fileOutputStream.write(b,0,readLen);
            count++;
        }
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println(count);
    }
}
