package other_thing.ideas;

/**
 * @Description: For test
 * @Author: 王政凯
 * @Date: 2024 下午8:13
 */

public class order {
    public static void main(String[] args) {
        new Car(new Person_("mamahaha"));
    }
}

class Car {
    public Car(Person_ p) {
        System.out.println("Car");
    }
}

class Person_ {
    public String name;
    public Person_(String s) {
        System.out.println("Person");
        System.out.println(1);
        System.out.println(2);
        this.name =s;
    }
}