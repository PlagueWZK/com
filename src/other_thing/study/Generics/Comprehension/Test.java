package other_thing.study.Generics.Comprehension;

/**
 * @author PlagueWZK
 * description: Test
 * date: 2025/1/11 01:26
 */

public class Test<T> {
    private final T value;

    public static void main(String[] args) {
        Test<Son> T = new Test<>(new Son());
        function<Son> consumer1 = t -> {
            System.out.println(t);
            System.out.println(t.getClass());
        };
        function<Father> consumer2 = t -> {
            System.out.println(t);
            System.out.println(t.getClass());
        };
        T.test1(consumer1);
        //T.test1(consumer2); //报错，不允许
        T.test2(consumer1);
        T.test2(consumer2);
    }


    public Test(T value) {
        this.value = value;
    }

    public void test1(function<T> consumer) {
        consumer.accept(value);
    }

    public void test2(function<? super T> consumer) {
        consumer.accept(value);
    }
}

interface function<A> {
    void accept(A t);
}

class Father {
}

class Son extends Father {
}