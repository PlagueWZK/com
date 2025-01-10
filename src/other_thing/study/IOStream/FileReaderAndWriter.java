package other_thing.study.IOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Description: FileReaderAndWriter
 * @Author: 王政凯
 * @Date: 2024 下午3:50
 */

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        writer();
    }


    public static void read() throws IOException {
        FileReader fileReader = new FileReader("src\\other_thing\\study\\IOStream\\t.txt");
        int readData;
        while ((readData = fileReader.read()) != -1) {
            System.out.print((char) readData);
        }
        fileReader.close();
    }

    public static void read2() throws IOException {
        FileReader fileReader = new FileReader("src\\other_thing\\study\\IOStream\\t.txt");
        int readLen;
        char[] buff = new char[8];
        while ((readLen = fileReader.read(buff)) != -1) {
            System.out.print(new String(buff, 0, readLen));
        }
        fileReader.close();
    }

    public static void writer() throws IOException {
        FileWriter fileWriter = new FileWriter("src\\other_thing\\study\\IOStream\\out.txt");
        char[] c = "风雨之后,必见彩虹".toCharArray();
        String s = "Hello World!";
        fileWriter.write(c);
        fileWriter.write("\n" + s);
        fileWriter.write("\n" + s, 0, 12);
        fileWriter.close();
    }
}
/*
  在Java中，字符流（如InputStreamReader、OutputStreamWriter等）确实是以字节流（如InputStream、OutputStream等）为底层实现的。字符流的主要目的是为了方便处理字符数据，特别是在处理不同编码的文本时，字符流能够自动处理编码和解码的问题，从而避免出现乱码。
  字符流是如何实现读取多字节字符而不出现乱码的呢？这主要依赖于以下几个步骤：
  编码和解码：字符流在处理文本数据时，会根据指定的字符编码（如UTF-8、GBK等）将字符转换为字节，或者将字节转换为字符。编码是将字符转换为字节的过程，解码是将字节转换为字符的过程。
  缓冲区：字符流通常使用缓冲区来存储读取或写入的字节。缓冲区的大小是固定的，当缓冲区满时，字符流会自动将缓冲区中的字节转换为字符，或者将字符转换为字节，然后进行处理。
  字符集转换：当字符流读取或写入文本数据时，它会根据指定的字符集（编码）进行转换。例如，当读取一个UTF-8编码的文件时，字符流会将文件中的字节按照UTF-8编码转换为字符；当写入一个UTF-8编码的文件时，字符流会将字符按照UTF-8编码转换为字节。
  自动处理多字节字符：在处理多字节字符时，字符流会自动处理字符的边界。例如，当读取一个UTF-8编码的文件时，字符流会确保读取的字节是一个完整的UTF-8字符，而不是一个不完整的字符。这样，即使文件中包含多字节字符，字符流也能够正确地读取和处理这些字符，从而避免出现乱码。
  总之，字符流通过编码和解码、缓冲区、字符集转换以及自动处理字符边界等方式，实现了读取多字节字符而不出现乱码的功能。这使得字符流在处理文本数据时更加方便和可靠。
 */
