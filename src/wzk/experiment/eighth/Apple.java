package wzk.experiment.eighth;

/**
 * @author PlagueWZK
 * description: Apple
 * date: 2025/1/2 19:56
 */

public class Apple extends Fruit implements Test {
    @Override
    public void transport() {
        super.transport();
        System.out.println("苹果通过货车运输");
    }

    @Override
    public void print() {
        System.out.println("苹果的价格为" + this.getPrice());
    }
}
