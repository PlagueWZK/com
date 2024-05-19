package Exercise.houserent.view;

import Exercise.houserent.domain.House;
import Exercise.houserent.service.HouseService;
import Exercise.houserent.util.HouseRentUtil;

import java.util.Arrays;

public class HouseView {
    private static boolean loop = true;

    public static void modifyHouse() {
        System.out.println("==============房屋信息修改==============");
        System.out.println("请输入修改房屋的id:(输入-1退出，输入-2进入查找系统)");
        HouseService.modifyHouseService();
    }
    public static void deleteHouse() {
        System.out.println("==============房屋信息删除==============");
        System.out.println("请输入删除房屋的id:(输入-1退出，输入-2进入查找系统)");
        HouseService.deleteHouseService();
    }
    public static void addHouse() {
        System.out.println("==============房屋信息添加==============");
        System.out.println("开始录入信息：");
        HouseService.addHouseService();
    }

    public static void findHouse() {
        System.out.println("==============查找房屋==============");
        System.out.println("请输入ID或户主名称或地址");
        HouseService.findHouseService(HouseRentUtil.readString(20, ""));
    }

    public static void listHouse() {
        House[] house = HouseService.list();
        int flag = 0;
        for (House value : house) {
            System.out.println(value == null);
            System.out.println(value);
            if (value != null) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("当前无房屋信息,请录入!");
            return;
        }
        System.out.println("==============房屋列表==============");
        HouseService.printOutSpecialThing();
        for (House value : house) {
            if (value != null) {
                System.out.print(value);
            }
        }
    }

    public static void mainMenu() {
        do {
            System.out.println("==============房屋出租系统===============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 房 屋 列 表");
            System.out.println("\t\t\t5 修 改 信 息");
            System.out.println("\t\t\t6 退      出");
            System.out.println("=======================================");
            System.out.println("请输入(1-6):");
            char key = HouseRentUtil.readMenuSelection();
            switch (key) {
                case '1' -> addHouse();
                case '2' -> findHouse();
                case '3' -> deleteHouse();
                case '4' -> listHouse();
                case '5' -> modifyHouse();
                case '6' -> loop = false;
            }
        } while (loop);
    }
}
