package other_thing.study.IOStream;

import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @Description: Standard_
 * @Author: 王政凯
 * @Date: 2024 下午8:21
 */

public class Standard_ {
    public static void main(String[] args) {
        //System.in是System类中的一个属性，属于InputStream类型，表示标准输入，默认从键盘输入
        //private final static InputStream in = null;
        //编译类型: InputStream
        //运行类型: BufferedInputStream
        System.out.println(System.in.getClass());
        //System.out是System类中的一个属性，属于PrintStream类型，表示标准输出，默认输出到控制台(显示器)
        //public final static PrintStream out =null;
        //编译类型: PrintStream
        //运行类型: PrintStream
        System.out.println(System.out.getClass());
    }
}
