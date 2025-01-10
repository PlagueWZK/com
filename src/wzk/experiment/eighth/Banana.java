package wzk.experiment.eighth;

/**
 * @author PlagueWZK
 * description: Banana
 * date: 2025/1/2 19:56
 */

public class Banana extends Fruit implements Test {
    @Override
    public void transport() {
        super.transport();
        System.out.println("香蕉通过火车运输");
    }

    @Override
    public void print() {
        System.out.println("香蕉的价格为" + getPrice());
    }
}
