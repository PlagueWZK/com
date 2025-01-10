package other_thing.study.IOStream.ObjectIOS;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description: ObjectInputString_
 * @Author: 王政凯
 * @Date: 2024 下午7:45
 */

public class ObjectInputString_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ObjectOutputStream_.path));
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readBoolean());

        System.out.println(objectInputStream.readDouble());
        System.out.println(objectInputStream.readUTF());
        Object o = objectInputStream.readObject();
        System.out.println(o.getClass());
        System.out.println(o);
        objectInputStream.close();
    }
}