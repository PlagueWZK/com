package other_thing.study.IOStream.ObjectIOS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description: ObjectOutputStream_
 * @Author: 王政凯
 * @Date: 2024 下午7:35
 */

public class ObjectOutputStream_ {
    public static final String path = "src\\other_thing\\study\\IOStream\\ObjectIOS\\out.dat";
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(3.14);
        objectOutputStream.writeUTF("Hello World");
        objectOutputStream.writeObject(new Person("张三", 18));

        objectOutputStream.close();
    }
}
class Person implements java.io.Serializable{
    private String name;
    private int age;
    private static final long SerialVersionUID = 1L;
    private transient int id;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}