package other_thing.study.reflection.basis;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author PlagueWZK
 * description: ReBase1
 * date: 2025/1/11 00:09
 */

public class ReBase1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/other_thing/study/reflection/basis/A1.properties"));
        String className = properties.get("classpath").toString();
        String methodName = properties.get("method").toString();

        Class<?> aClass = Class.forName(className);
        Object o = aClass.getDeclaredConstructor().newInstance();
        System.out.println(o.getClass());

        Method method = aClass.getMethod(methodName);
        method.invoke(o);
    }
}
