package wzk.test;

/**
 * @author PlagueWZK
 * description: Topic2
 * date: 2024/11/5 20:08
 */

public class Topic2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
