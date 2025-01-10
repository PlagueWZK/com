package wzk.experiment.ninth;

/**
 * @author PlagueWZK
 * description: Solution
 * date: 2025/1/2 20:14
 */

public class Student {
    private String name;
    private int age;

    public int divide(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return x / y;
    }

    public void print() {
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
    }
}
