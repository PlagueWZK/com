package Exercise.houserent.service;

import Exercise.houserent.domain.House;
import Exercise.houserent.util.HouseRentUtil;
import Exercise.houserent.view.HouseView;

public class HouseService {
    private static House[] house = new House[1];

    public static House[] list() {
        return house;
    }

    public static void addHouseService_w() {
        houseAdd();
        house[house.length - 1] = new House(1, "wzk", "114514", "some", 10000, "1");
        houseAdd();
        house[house.length - 1] = new House(2, "wzl", "11451654", "thing", 50000, "1");
    }

    private static int houseAdd() {
        for (int i = 0; i < house.length; i++) {
            if (nullPointerSelfTest(house[i])) {
                house[i] = new House((i + 1), "", "", "", -1, "");
                return i;
            }
        }
        House[] tempHouse = new House[house.length + 1];
        //数组扩容
        System.arraycopy(house, 0, tempHouse, 0, house.length);
        tempHouse[tempHouse.length - 1] = new House(tempHouse.length, "", "", "", -1, "");
        house = tempHouse;
        return house.length - 1;
    }

    public static boolean nullPointerSelfTest(House house) {
        return house == null;
    }

    public static void addHouseService() {
        int index = houseAdd();
        System.out.print("请输入姓名:");
        house[index].setName(HouseRentUtil.readKeyBoard(6, false));
        System.out.print("请输入电话:");
        house[index].setTelephone(HouseRentUtil.readKeyBoard(12, false));
        System.out.print("请输入地址:");
        house[index].setAddress(HouseRentUtil.readKeyBoard(20, false));
        System.out.print("请输入租金");
        house[index].setRent(HouseRentUtil.readInt(12));
        System.out.print("请输入状态当前(未出租[1]/已出租[2])");
        house[index].setStatus();
        System.out.println("房屋信息添加成功!");
        printOutSpecialThing();
        System.out.println(house[index].toString());
    }

    public static int findHouseService(int identification) {
        if (identification == -1) return -1;
        if (identification == -2) return -2;
        int id;
        for (House value : house) {
            if (value == null) continue;
            id = value.getId();
            if (identification == id) {
                return id;
            }
            return -3;

        }
        return -3;
    }

    public static void findHouseService(String str) {
        int counter = -1;
        //检测ID
        for (House value : house) {
            if ((str.equals(Integer.toString(value.getId())))) {
                System.out.println("查找到相关房屋:");
                printOutSpecialThing();
                System.out.println(value);
                return;
            } else {
                //此时排除ID特选
                char strChar, houseChar;
                int test = -1, index = -1;
                for (int k = 0; k < str.length(); k++) {
                    strChar = str.charAt(k);
                    for (int l = index + 1; l < value.getName().length(); l++) {
                        houseChar = value.getName().charAt(l);
                        if (strChar == houseChar) {
                            index = l;
                            test = 0;
                            if (l == value.getName().length() - 1 && (k != str.length() - 1)) {
                                test = -2;
                            }
                            break;
                        } else {
                            test = -2;
                        }
                    }
                    if (test != 0) {
                        System.out.println("未查找到相关房屋");
                        break;
                    }
                }
                if (test == 0) {
                    if (counter == -1) {
                        System.out.println("查找到相关房屋:");
                        printOutSpecialThing();
                        counter = 0;
                    }
                    System.out.print(value);
                }
            }
        }
    }

    public static void modifyHouseService() {
        int identification = findHouseService(HouseRentUtil.readInt(10));
        if (identification == -1) {
            System.out.println("==============已退出修改系统=============");
            return;
        }
        if (identification == -2) {
            //进入查找系统
            HouseView.findHouse();
            return;
        }
        if (identification != -3) {
            System.out.println("您正在修改id为" + identification + "的房屋");
            printOutSpecialThing();
            System.out.println(house[identification - 1].toString());
            House tempMotifyHouse = new House(house[identification -1].getId(),house[identification -1].getName(),house[identification -1].getTelephone(),house[identification -1].getAddress(),house[identification -1].getRent(),house[identification -1].getStatus());
            System.out.print("请输入姓名(回车则跳过修改):");
            tempMotifyHouse.setName(HouseRentUtil.readString(6,house[identification - 1].getName()));
            System.out.print("请输入电话(回车则跳过修改):");
            tempMotifyHouse.setTelephone(HouseRentUtil.readString(6,house[identification - 1].getTelephone()));
            System.out.print("请输入地址(回车则跳过修改):");
            tempMotifyHouse.setAddress(HouseRentUtil.readString(6,house[identification - 1].getAddress()));
            System.out.print("请输入租金");
            tempMotifyHouse.setRent(HouseRentUtil.readInt(12));
            System.out.print("请输入状态当前(未出租[1]/已出租[2])");
            tempMotifyHouse.setStatus();
            System.out.println("是否确认修改(Y or N)?");
            if (HouseRentUtil.readConfirmSelection() == 'Y') {
                house[identification - 1] = tempMotifyHouse;
                System.out.println("修改成功!");
                printOutSpecialThing();
                System.out.println(house[identification - 1].toString());
                return;
            }
            System.out.println("==============已取消修改=============");
            return;
        }
        System.out.println("未查找到相关房屋");
    }
    public static void deleteHouseService() {
        int identification = findHouseService(HouseRentUtil.readInt(10));
        if (identification == -1) {
            System.out.println("==============已退出删除系统=============");
            return;
        }
        if (identification == -2) {
            //进入查找系统
            HouseView.findHouse();
            return;
        }
        if (identification != -3) {
            System.out.println("确定要删除id为" + identification + "的房屋吗(不可反悔😢)?");
            printOutSpecialThing();
            System.out.println(house[identification - 1].toString());
            System.out.println("输入Y or N 以选择:");
            if (HouseRentUtil.readConfirmSelection() == 'Y') {
                house[identification - 1] = null;
                System.out.println("已经将该房屋信息删除!");
                return;
            }
            System.out.println("==============已退出删除系统=============");
            return;
        }
        System.out.println("未查找到相关房屋");
    }
    public static void printOutSpecialThing() {
        System.out.println("编号\t\t姓名\t\t\t电话\t\t\t\t地址\t\t\t\t月租\t\t\t状态");
    }
}

