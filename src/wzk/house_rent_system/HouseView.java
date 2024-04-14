package wzk.house_rent_system;

public class HouseView {
    private static boolean loop = true;

    public static void houseMenu() {
        int choice;
        HouseService.houseAddService_w();
        do {
            System.out.println("====================房屋出租系统====================");
            System.out.println("\t\t\t\t1 增加房屋");
            System.out.println("\t\t\t\t2 删除房屋");
            System.out.println("\t\t\t\t3 修改房屋");
            System.out.println("\t\t\t\t4 房屋列表");
            System.out.println("\t\t\t\t5 查找房屋");
            System.out.println("\t\t\t\t6 退出系统");
            System.out.println("==================================================");
            choice = HouseUtil.readInteger((byte) 1);
            switch (choice) {
                case 1 -> addHouse();
                case 2 -> deleteHouse();
                case 3 -> modifyHouse();
                case 4 -> houseList();
                case 5 -> findHouse();
                case 6 -> exitSystem();
                default -> System.out.println("请选择 1 - 6的数字");
            }
        } while (loop);
    }

    public static void addHouse() {
        System.out.print("请输入姓名: ");
        String name = HouseUtil.readString((byte) 8, "未涉及");
        System.out.print("请输入电话: ");
        String telephone = HouseUtil.readString((byte) 20, "未涉及");
        System.out.print("请输入地址: ");
        String address = HouseUtil.readString((byte) 16, "未涉及");
        System.out.print("请输入租金: ");
        double rent = HouseUtil.readDouble((byte) 8, 0);
        System.out.print("请输入状态(未出租[1]/已出租[2]): ");
        String status = HouseUtil.readStatus();
        System.out.print("请输入安全密码: ");
        String password = HouseUtil.readKeyBoard((byte) 20, false);
        int index = HouseService.addHouseService(name, telephone, address, rent, status, password);
        System.out.println("你成功添加了房屋");
        printPrefix();
        System.out.println(HouseService.getHouses()[index].toString());
    }

    public static void deleteHouse() {
        System.out.println("请输入要删除房屋的ID");
        HouseService.deleteHouseService(HouseUtil.readInteger((byte) 4));
    }

    public static void modifyHouse() {
        System.out.println("请输入要修改房屋的ID");
        HouseService.modifyHouseService(HouseUtil.readInteger((byte) 4));
    }

    public static void findHouse() {
        System.out.println("请输入要查找房屋的ID");
        HouseService.findHouseService(HouseUtil.readInteger((byte) 4));
    }

    public static void exitSystem() {
        System.out.println("是否退出系统?(输入Y or N)");
        char c = HouseUtil.chooseYorN();
        if (c == 'Y') {
            loop = false;
            System.out.println("你退出了系统");
        }
    }

    public static void houseList() {
        if (HouseService.getHouses().length == 0) {
            System.out.println("暂无房屋信息，请录入");
            return;
        }
        printPrefix();
        for (House house : HouseService.getHouses()) {
            if (house != null)
                System.out.println(house);
        }
    }

    public static void printPrefix() {
        System.out.println(String.format("%-4s", "ID") + String.format("%-8s", "Name") + String.format("%-20s", "TelephoneNumber") +
                String.format("%-16s", "Address") + String.format("%-8s", "Rent") + String.format("%-4s", "Status"));
    }
}
