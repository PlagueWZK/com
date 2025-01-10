package other_thing.study.Generics;

public class Gene {
    public static void main(String[] args) {
        Person<Integer> a = new Person<>(5);
        System.out.println(a.getS());
    }
}
class Person<E> {
    E s;
    Person(E s) {
        this.s = s;
    }
    public E getS() {
        return s;
    }
}
