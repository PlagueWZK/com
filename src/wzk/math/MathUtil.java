package wzk.math;

import java.util.Scanner;

public class MathUtil {
    public static Scanner scanner = new Scanner(System.in);

    public static String readKeyBoard() {
        return scanner.nextLine();
    }

    public static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(readKeyBoard());
            } catch (NumberFormatException e) {
                System.out.println("请输入一个有效数字");
            }
        }
    }

    public static Double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(readKeyBoard());
            } catch (NumberFormatException e) {
                System.out.println("请输入一个有效数字");
            }
        }
    }

    public static char readOneUpperChar() {
        while (true) {
            try {
                return readKeyBoard().toUpperCase().charAt(0);
            } catch (NumberFormatException e) {
                System.out.println("请输入一个有效字符");
            }
        }
    }

    public static boolean confirm() {
        char c = readOneUpperChar();
        return c == 'Y';
    }
}
