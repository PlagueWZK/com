package wzk.experiment.tenth;

import java.util.Random;

/**
 * @author PlagueWZK
 * description: Solution
 * date: 2025/1/2 20:21
 */

public class Solution {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(0, 100));
        }
    }
}
