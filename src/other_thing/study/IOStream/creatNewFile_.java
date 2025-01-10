package other_thing.study.IOStream;

import java.io.File;
import java.io.IOException;

public class creatNewFile_ {
    public static void main(String[] args) throws IOException {
        creatFile2();
    }

    public static void creatFile() throws IOException {
        File file1 = new File("IOTestFile/A.txt");
        File file2 = new File("src\\B.txt");
        file2.createNewFile();
    }
    public static void creatFile2() throws IOException {
        File parentFile = new File("src\\");
        File childFile = new File(parentFile, "IOTestFile/C.txt");
        childFile.createNewFile();
    }
}
