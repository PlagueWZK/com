package other_thing.study.IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description: BufferReader_
 * @Author: 王政凯
 * @Date: 2024 下午6:58
 */

public class BufferReader_ {
    public static void main(String[] args) throws IOException{
        buffReader();
    }

    public static void buffReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\wzk\\houserent\\util\\HouseRentUtil.java"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
