package wzk.exception_exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println(calDivision(scanner.nextInt(),scanner.nextInt()));
        } catch (InputMismatchException e) {
            System.out.println("输入非法数字");
        }
    }
    public static float calDivision(int a, int b) {
        try {
            return (float)a/b;
        } catch (ArithmeticException e) {
            System.out.println("数学错误!");
        }
        return -1;
    }
}
