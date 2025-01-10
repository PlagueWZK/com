package wzk.experiment.fifteenth;

/**
 * @author PlagueWZK
 * description: Solution
 * date: 2025/1/2 21:12
 */

import java.io.File;

public class FileTraversal {
    public static void main(String[] args) {
        String path = "D:\\Mything\\MyProgram\\JAVA\\com\\src\\wzk\\experiment";
        File root = new File(path);
        if (root.exists() && root.isDirectory()) {
            traverseDirectory(root);
        } else {
            System.out.println("目录不存在或路径不是一个目录！");
        }
    }

    public static void traverseDirectory(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    traverseDirectory(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
