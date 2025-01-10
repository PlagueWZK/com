package wzk.test;

/**
 * @author PlagueWZK
 * description: Children
 * date: 2024/11/5 20:23
 */

public class Children extends Father{
    public static void main(String[] args) {
        //1.通过子类对象访问
        Children obj = new Children();
        System.out.println(obj.name);
        //2.通过父类对象访问
        Father father = new Father();
        System.out.println(father.name);
    }
}
