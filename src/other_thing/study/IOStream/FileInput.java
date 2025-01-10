package other_thing.study.IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInput {
    public static void main(String[] args) throws IOException{
        inputFile2();
    }

    public static void inputFile() throws IOException {
        FileInputStream fileInput = new FileInputStream("src\\C.txt");
        int readData;
        while ((readData = fileInput.read()) != -1) {
            System.out.print( readData);
        }
        System.out.println();
        fileInput.close();
        fileInput = new FileInputStream("src\\C.txt");
        while ((readData = fileInput.read()) != -1) {
            System.out.print((char) readData);
        }
        fileInput.close();
        //以字节形式输出，若为汉字，汉字占用不止一个字节，一般为3字节(UTF8)或者2字节，当读汉字是会出现乱码,应该用字符流处理
    }
    public static void inputFile2() throws IOException{
        FileInputStream fileInputStream = new FileInputStream("src\\C.txt");
        int readData,count = 0;
        byte[] b = new byte[8];
        //byte数组每个单位都是一个byte（字节），每个字节由8bit组成，即2^8 = 256,范围是-127~128。使用该方法后数组中每个字节单位都表示一个字符的ASCII码
        while ((readData = fileInputStream.read(b)) != -1) {
            System.out.println("第"+count+"次 :");
            System.out.println(Arrays.toString(b));
            System.out.println("readData="+readData);
            System.out.println(new String(b,0,readData)); //显示
            count++;
        }
        //第三次读取时只会替换byte数组中的第一个值，因为只剩一个字节了，并且数组中后边的字节不会自动清除
        fileInputStream.close();
        System.out.println("\n"+count);
    }
    //从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可读取
    //如果返回-1，表示读取完毕
    //该方法(read(byte[]))如果读取正常，返回实际读取的字节数
}
