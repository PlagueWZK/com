package wzk.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author PlagueWZK
 * description: OuterClass
 * date: 2024/11/5 20:49
 */

public class OuterClass {
    public static void main(String[] args) {
        //创建外部类对象
        OuterClass obj = new OuterClass();
        //调用方法
        obj.display();
    }
    //外部类方法
    public void display() {
        //声明局部内部类
        class InnerClass {
            public void display() {
                System.out.println("InnerClass");
            }
        }
        //创建局部内部类对象
        InnerClass obj = new InnerClass();
        //调用内部类方法
        obj.display();
    }
    public static void A() throws IOException {
        FileReader fr = new FileReader("");
    }
}
