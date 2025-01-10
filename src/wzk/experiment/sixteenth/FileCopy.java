package wzk.experiment.sixteenth;

/**
 * @author PlagueWZK
 * description: A
 * date: 2025/1/2 21:17
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFilePath = "D:\\Mything\\MyProgram\\JAVA\\com\\src\\wzk\\experiment\\sixteenth\\file.png";
        String destFilePath = "D:\\Mything\\MyProgram\\JAVA\\com\\src\\wzk\\experiment\\sixteenth\\copy.png";

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destFilePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("文件复制成功！");
        } catch (IOException e) {
            System.err.println("文件复制失败：" + e.getMessage());
        }
    }
}
