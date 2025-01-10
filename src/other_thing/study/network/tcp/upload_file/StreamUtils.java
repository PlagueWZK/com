package other_thing.study.network.tcp.upload_file;

import java.io.*;

/**
 * @author PlagueWZK
 * description: StreamUtils
 * date: 2024/12/29 13:29
 */

public abstract class StreamUtils {

    /**
     *
     * @param is 输入流
     * @return 返回输入流转化为的字节数组
     * @throws IOException 如果读取输入流时发生 I/O 错误
     */
    public static byte[] streamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = is.read(buf)) != -1) {
            bos.write(buf, 0, len);
        }
        byte[] bytes = bos.toByteArray();
        bos.close();
        return bytes;
    }

    public static String streamToString(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\r\n");
        }
        return sb.toString();
    }
}
