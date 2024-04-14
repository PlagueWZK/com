package wzk.house_rent_system;

import java.util.Scanner;

public class HouseUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readKeyBoard(Byte limit, boolean allowNull) {
        String str = "";
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            if (str.length() == 0) {
                if (allowNull) {
                    return "";
                }
                System.out.println("内容不允许为空");
                continue;
            }
            if (str.length() <= limit) {
                return str;
            }
            System.out.println("字符数不得超过" + limit + "个,当前为" + str.length());
        }
        return str;
    }

    public static int readInteger(Byte limit) {
        while (true) {
            try {
                return Integer.parseInt(readKeyBoard(limit, false));
            } catch (NumberFormatException e) {
                System.out.println("请输入一个有效数字");
            }
        }
    }

    public static double readDouble(Byte limit, double Default) {
        String str;
        double inPut;
        while (true) {
            str = readKeyBoard(limit, true);
            if (str.equals("")) {
                return Default;
            }
            try {
                inPut = Double.parseDouble(str);
            } catch (NumberFormatException e) {
                System.out.println("请输入一个有效数字");
                continue;
            }
            return inPut;
        }
    }

    public static String readString(Byte limit, String Default) {
        String inPut = readKeyBoard(limit, true);
        if (!inPut.equals("")) {
            return inPut;
        }
        return Default;
    }

    public static char chooseYorN() {
        while (true) {
            char c;
            try {
                c = readKeyBoard((byte) 1, false).toUpperCase().charAt(0);
            } catch (Exception e) {
                System.out.println("请输入一个有效字符");
                continue;
            }
            if (c == 'Y' || c == 'N') {
                return c;
            }
            System.out.println("输入有误!");
        }
    }

    public static String readStatus() {
        String status;
        while (true) {
            status = readKeyBoard((byte) 3, true);
            if (status.equals("未出租") || status.equals("已出租") || status.equals("1") || status.equals("2") || status.equals("")) {
                if (status.equals("1")) {
                    status = "未出租";
                }
                if (status.equals("2")) {
                    status = "已出租";
                }
                if (status.equals("")) {
                    return "未出租";
                }
                return status;
            }
            System.out.println("请输入有效关键字!");
        }
    }
}
