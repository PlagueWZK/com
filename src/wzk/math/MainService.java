package wzk.math;

public class MainService {
    static Element[] elements = new Element[0];
    static boolean loop = true;

    public static void displayMenu() {
        do {
            System.out.println("数据统计模块");
            System.out.println("功能列表:");
            System.out.println("\t1 新建数据组\n\t2 查看指定数据组\n\t3 列出所有数据组\n\t4 删除指定数据组\n\t5 退出程序");
            System.out.println("键入数字以继续...");
            switch (MathUtil.readInt()) {
                case 1 -> newArrayChoice();
                case 2 -> findCertainArray();
                case 3 -> listAllArray();
                case 4 -> deleteCertainArray();
                case 5 -> exitProgram();
                default -> System.out.println("请输入正确数字" +
                        "!");
            }
        } while (loop);
    }

    private static void newArrayChoice() {
        boolean loop = true;
        System.out.println("\t1 单独数据组\n\t2 对比数据组\n\t3 返回菜单");
        System.out.print("请选择类型:");
        do {
            switch (MathUtil.readInt()) {
                case 1 -> {
                    loop = false;
                    addNewArray();
                }
                case 2 -> {
                    loop = false;
                    addCompareArrays();
                }
                case 3 -> loop = false;
                default -> System.out.println("请输入正确数字!");
            }
        } while (loop);
    }

    private static void addCompareArrays() {
    }

    private static void exitProgram() {
        System.out.println("你确定要退出系统吗?(Y/y)");
        loop = !MathUtil.confirm();
        if (!loop) {
            System.out.println("你已经成功退出傻逼系统");
        }
    }

    private static void deleteCertainArray() {
        System.out.print("请输入数据组名称:");
        String identifier = MathUtil.readKeyBoard();
        for (Element value : elements) {
            if (value.name.equals(identifier)) {
                elements[value.group - 1] = null;
            }
        }
        System.out.println("删除成功");
    }

    private static void listAllArray() {
        System.out.println("以下是所有数据组");
        for (Element value : elements) {
            if (value == null) {
                continue;
            }
            System.out.print(value);
        }
    }

    private static void findCertainArray() {
        System.out.print("请输入组别或数据组名称:");
        String identifier = MathUtil.readKeyBoard();
        boolean ifHave = false;
        for (Element value : elements) {
            if (value == null) {
                continue;
            }
            if (value.name.equals(identifier)) {
                System.out.print(value);
                ifHave = true;
                value.visible = false;
            }
            if (String.valueOf(value.group).equals(identifier) && value.visible) {
                System.out.print(value);
                ifHave = true;
            }
            value.visible = true;
        }
        if (ifHave) {
            System.out.println("为你找到以上数据组👆");
        } else {
            System.out.println("未找到相关数据组!");
        }
    }

    public static double[] putInArray() {
        double[] array = new double[0];
        String str;
        double number;
        int n = 1;
        while (true) {
            System.out.print("请输入第" + n + "个数据:");
            str = MathUtil.readKeyBoard();
            if (str.equals(" ")) {
                break;
            }
            try {
                number = Double.parseDouble(str);
            } catch (NumberFormatException e) {
                System.out.println("请输入一个有效数字");
                continue;
            }
            array = doubleArrayExpansion(array);
            array[array.length - 1] = number;
            n++;
        }
        return array;
    }


    private static void addNewArray() {
        Element.count++;
        elements = arrayExpansion(elements);
        System.out.print("请输入名称:");
        String name = null;
        boolean loop = true;
        while (loop) {
            name = MathUtil.readKeyBoard();
            for (Element value : elements) {
                if (value != null && value.name.equals(name)) {
                    System.out.print("名称重复！请重新输入:");
                    break;
                }
                loop = false;
            }
        }
        elements[Element.getCount() - 1] = new Element(name, putInArray());
        System.out.println("数组创建完成");
        System.out.println(elements[Element.getCount() - 1].FormatToString());
    }

    public static double[] doubleArrayExpansion(double[] ds) {
        int length = ds.length;
        double[] newDs = new double[length + 1];
        System.arraycopy(ds, 0, newDs, 0, length);
        return newDs;
    }

    public static Element[] arrayExpansion(Element[] elements) {
        int length = elements.length;
        Element[] newE = new Element[length + 1];
        System.arraycopy(elements, 0, newE, 0, length);
        return newE;
    }
}
