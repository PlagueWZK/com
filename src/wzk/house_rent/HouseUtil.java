package wzk.house_rent;

import java.util.Scanner;

public class HouseUtil {
    public static final Scanner scanner = new Scanner(System.in);

    public static String readKeyboard(int limit, boolean allowNullCharacter) {
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                if (allowNullCharacter) return "";
                System.out.println("不允许输入空字符!");
                continue;
            }
            int length = str.length();
            if (length <= limit)
                return str;
            System.out.println("输入内容不允许超出" + limit + "个字符，当前为" + length + "个字符");
        }
        return "";
    }

    public static int readIntNumber(int limit, final int DEFAULT) {
        String number = readKeyboard(limit, true);
        if (number.equals("")) return DEFAULT;
        while (true) {
            try {
                return Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请重新输入!");
            }
        }
    }

    public static double readDoubleNumber(int limit, final double DEFAULT) {
        String number = readKeyboard(limit, true);
        if (number.equals("")) return DEFAULT;
        while (true) {
            try {
                return Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请重新输入!");
            }
        }
    }

    public static String readString(int limit, final String DEFAULT) {
        String str = readKeyboard(limit, true);
        if (str.equals("")) return DEFAULT;
        return str;
    }

    public static char reChar() {
        char c;
        while (true) {
            c = readString(1, "N").toUpperCase().charAt(0);
            if (c == 'Y' || c == 'N')
                return c;
            System.out.println("输入有误，请重新输入!");
        }
    }

    public static boolean choose() {
        char c = reChar();
        return c == 'Y';
    }
}
