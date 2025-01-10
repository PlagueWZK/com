package wzk.experiment.fourth;

/**
 * @author PlagueWZK
 * description: A
 * date: 2025/1/2 21:09
 */

public class GenericImpl<T> implements Generic<T> {
    @Override
    public T get(T t) {
        System.out.println("调用了get()方法，传入的值为：" + t);
        return t;
    }

    public static void main(String[] args) {
        Generic<String> stringGeneric = new GenericImpl<>();
        String result1 = stringGeneric.get("Hello, World");
        System.out.println("返回的值为：" + result1);

        Generic<Integer> integerGeneric = new GenericImpl<>();
        Integer result2 = integerGeneric.get(12345);
        System.out.println("返回的值为：" + result2);

        Generic<Double> doubleGeneric = new GenericImpl<>();
        Double result3 = doubleGeneric.get(3.14159);
        System.out.println("返回的值为：" + result3);
    }
}
