package other_thing.study.IOStream.Properties_;

import java.io.*;
import java.util.Properties;

/**
 * @Description: Properties_
 * @Author: 王政凯
 * @Date: 2024 下午9:56
 */

public class Properties_ {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\other_thing\\study\\IOStream\\Properties_\\mysql.properties"));
        properties.list(System.out);
        System.out.println(properties.getProperty("user"));
        properties.setProperty("A","true");
        properties.setProperty("name","王忠睿");
        //这里注意到在新创建的文件中有上述提到的user和password键值对被保存，因此properties对象也会保存已经读取的键值对（在执行load方法时，会读取到这些键值对）
        //正是因为properties是集合类的储存
        properties.store(new FileOutputStream("src\\other_thing\\study\\IOStream\\Properties_\\mysql2.properties"),"");
        //properties.store(new FileWriter("src\\other_thing\\study\\IOStream\\Properties_\\mysql2.properties"),"");
        //若在构建时使用字符流对象，输出的汉字在文本中在UTF-8 编码下将会是汉字，字节流则是汉字的Unicode编码
    }

}
