package wzk.experiment.seventh;

/**
 * @author PlagueWZK
 * description: Apple
 * date: 2025/1/2 19:38
 */

public class Apple extends Fruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Apple.setName("苹果");

        Banana.setPrice(5);
        System.out.println(Banana.getPrice());

    }

}
