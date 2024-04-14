package wzk.test;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Test o = new Test();
        System.out.println(o.O("尊嘟假嘟?"));
    }
    public int O(String str) {

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        for (int i = 0;i <= 1;i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        return sum;
    }
}
