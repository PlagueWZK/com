package other_thing.study.IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: BufferWriter_
 * @Author: 王政凯
 * @Date: 2024 下午12:23
 */

public class BufferWriter_ {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\other_thing\\study\\IOStream\\t.txt"));
        bw.write("Fuck u");
        bw.close();
    }
}
