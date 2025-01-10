package other_thing.study.IOStream;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        info();
    }

    public static void info() {
        File file = new File("src\\C.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canExecute());
    }
}
