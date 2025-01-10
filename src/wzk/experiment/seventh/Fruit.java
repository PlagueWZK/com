package wzk.experiment.seventh;

/**
 * @author PlagueWZK
 * description: Fruit
 * date: 2025/1/2 19:37
 */

public class Fruit {
    private static String name;
    private static int price;

    public void print() {
        System.out.println(name + "的价格为：" + price);
    }

    public static void transport() {
        System.out.println("水果运输方式");
    }

    public static void setName(String name) {
        Fruit.name = name;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Fruit.price = price;
    }
}
