package other_thing.study.IOStream;

import javax.swing.text.html.HTMLDocument;
import java.io.File;
import java.io.IOException;

public class Directory {

    public static void main(String[] args) throws IOException{
        //creatFile();
        //此处若手动创建“D”的目录(上面的方法会创建名字为“D”的文件)，仍会删除
        //deleteFile();
        creatDir();
    }
    public static void creatFile() throws IOException {
        File file = new File("src\\D");
        file.createNewFile();
    }
    public static void deleteFile() {
        File a = new File("src\\D");
        if (a.exists()) {
            if (a.delete())
                System.out.println("删除成功");
        }
        else {
            System.out.println("文件不存在!");
        }
    }
    @SuppressWarnings("all")
    public static void creatDir(){
        File f = new File("src\\IOTest\\a\\b");
        if (f.exists()) {
            System.out.println("文件存在");
        } else {
            f.mkdirs();
            //mkdirs()创建多级目录，mkdir()创建一级目录
        }
    }
}
