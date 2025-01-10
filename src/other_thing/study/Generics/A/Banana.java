package other_thing.study.Generics.A;

/**
 * @author PlagueWZK
 * description: Banana
 * date: 2024/12/22 00:49
 */

public class Banana extends Fruit{
    private final int length;
    public Banana(int length) {
        super("Banana");
        this.length = length;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "length=" + length +
                '}';
    }
}
