package other_thing.study.Generics.A;

/**
 * @author PlagueWZK
 * description: Fruit
 * date: 2024/11/28 18:37
 */

public class Fruit {
    private String name;

    public String getName() {
        return name;
    }

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit() {
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
