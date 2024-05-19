package Exercise.houserent.util;

import java.util.Scanner;

public class HouseRentUtil {

    public static Scanner scanner = new Scanner(System.in);

    public static String readKeyBoard(int limit, boolean ifIsNull) {
        String inPut = "";
        while (scanner.hasNextLine()) {
            inPut = scanner.nextLine();
            if (inPut.length() == 0) {
                if (ifIsNull) {
                    return inPut;
                } else {
                    System.out.println("内容不能为空!");
                }
            } else {
                if (inPut.length() <= limit) {
                    return inPut;
                } else {
                    System.out.println("长度不能超过" + limit + "!");
                }
            }
        }
        return inPut;
    }

    public static char readConfirmSelection() {
        char s = readKeyBoard(1, false).toUpperCase().charAt(0);
        while (true) {
            if (s == 'Y' || s == 'N') {
                return s;
            } else {
                System.out.println("错误请重新输入:");
            }
        }
    }

    public static char readMenuSelection() {
        char selection;
        while (true) {
            selection = readKeyBoard(1, false).charAt(0);
            if ((selection != '1') && (selection != '2') && (selection != '3') && (selection != '4') && (selection != '5') && (selection != '6')) {
                System.out.println("请重新输入！");
            } else break;
        }
        return selection;
    }

    public static int readInt(int limit) {
        int a;
        while (true) {
            try {
                a = Integer.parseInt(readKeyBoard(limit, false));
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误!");
            }
        }
        return a;
    }

    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return (str.equals("")) ? defaultValue : str;
    }
}
