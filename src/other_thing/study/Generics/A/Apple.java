package other_thing.study.Generics.A;

/**
 * @author PlagueWZK
 * description: Apple
 * date: 2024/11/28 18:38
 */

public class Apple extends Fruit{
    private final int weight;

    public Apple(int weight) {
        super("苹果");
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
