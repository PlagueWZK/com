package wzk.experiment.seventeenth;

/**
 * @author PlagueWZK
 * description: A
 * date: 2025/1/2 21:25
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) {
        String sourceFilePath = "D:\\Mything\\MyProgram\\JAVA\\com\\src\\wzk\\experiment\\seventeenth\\Hello.txt"; // 源文件路径
        String destFilePath = "D:\\Mything\\MyProgram\\JAVA\\com\\src\\wzk\\experiment\\seventeenth\\B.txt"; // 目标文件路径

        try (FileReader reader = new FileReader(sourceFilePath);
             FileWriter writer = new FileWriter(destFilePath)) {

            char[] buffer = new char[1024];
            int charsRead;
            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }

            System.out.println("文件读写操作完成！");
        } catch (IOException e) {
            System.err.println("文件操作失败：" + e.getMessage());
        }
    }
}
