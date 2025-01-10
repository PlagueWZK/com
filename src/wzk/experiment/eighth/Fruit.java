package wzk.experiment.eighth;

/**
 * @author PlagueWZK
 * description: Fruit
 * date: 2025/1/2 19:56
 */

public abstract class Fruit {
    private String name;
    private int price;

    public void print() {
        System.out.println(name + "的价格为：" + price);
    }

    public void transport() {
        System.out.println("运输水果");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
    }

    public int getPrice() {
        return price;
    }
}
