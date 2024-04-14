package wzk.house_rent_system;


public class HouseService {
    private static House[] houses = new House[0];

    public static House[] getHouses() {
        return houses;
    }

    public static void addHouses() {
        House[] tempHouses = new House[getHouses().length + 1];
        System.arraycopy(getHouses(), 0, tempHouses, 0, getHouses().length);
        houses = tempHouses;
    }

    public static int addHouseService(String name, String telephone, String address, double rent, String status, String password) {
        int index = 0;
        for (House value : houses) {
            if (ifHouseIsNull(value)) {
                houses[index] = new House((index + 1), name, telephone, address, rent, status, password);
                return index;
            }
            index++;
        }
        addHouses();
        houses[houses.length - 1] = new House(houses.length, name, telephone, address, rent, status, password);
        return houses.length - 1;
    }

    public static boolean ifHouseIsNull(House house) {
        return house == null;
    }

    public static void houseAddService_w() {
        addHouses();
        houses[houses.length - 1] = new House(houses.length, "w", "16468646556",
                "New York", 20000, "未出租", "110");
        addHouses();
        houses[houses.length - 1] = new House(houses.length, "a", "16484894655",
                "Houston", 50000, "未出租", "119");
        addHouses();

    }

    public static void findHouseService(int id) {
        for (House value : houses) {
            if (!ifHouseIsNull(value) && value.getId() == id) {
                System.out.println("查找到以下房屋:");
                HouseView.printPrefix();
                System.out.println(value);
                return;
            }
        }
        System.out.println("未查找到有效房屋");
    }

    public static void deleteHouseService(int id) {
        for (House value : houses) {
            if (!ifHouseIsNull(value) && value.getId() == id) {
                System.out.println("确定要删除以下房屋吗(永远消失😢!输入Y or N): ");
                HouseView.printPrefix();
                System.out.println(value);
                char c = HouseUtil.chooseYorN();
                if (c == 'Y') {
                    System.out.println("请输入安全密码:");
                    while (true) {
                        String pas = HouseUtil.readKeyBoard((byte) 20, false);
                        if (pas.equals(value.getPassword())) {
                            houses[id - 1] = null;
                            System.out.println("你成功删除了房屋！");
                            return;
                        }
                        if (pas.equals("-1"))
                            return;
                        System.out.println("密码错误，请重新输入(输入-1取消):");
                    }
                }
                return;
            }
        }
        System.out.println("未查找到有效房屋");
    }

    public static void modifyHouseService(int id) {
        for (House value : houses) {
            if (!ifHouseIsNull(value) && value.getId() == id) {
                System.out.println("确定要修改以下房屋吗(Y or N)?");
                HouseView.printPrefix();
                System.out.println(value);
                char c = HouseUtil.chooseYorN();
                if (c == 'Y') {
                    System.out.println("请输入安全密码:");
                    while (true) {
                        String pas = HouseUtil.readKeyBoard((byte) 20, false);
                        if (pas.equals(value.getPassword())) {
                            House temp = houses[id - 1];
                            System.out.print("请输入姓名(回车默认: " + temp.getName() + "): ");
                            temp.setName(HouseUtil.readString((byte) 8, temp.getName()));
                            System.out.print("请输入电话(回车默认: " + temp.getTelephone() + "): ");
                            temp.setTelephone(HouseUtil.readString((byte) 20, temp.getTelephone()));
                            System.out.print("请输入地址(回车默认: " + temp.getAddress() + "): ");
                            temp.setAddress(HouseUtil.readString((byte) 16, temp.getAddress()));
                            System.out.print("请输入租金(回车默认: " + temp.getRent() + "): ");
                            temp.setRent(HouseUtil.readDouble((byte) 8, temp.getRent()));
                            System.out.print("请输入状态(未出租[1]/已出租[2]): (回车默认: " + temp.getStatus() + "): ");
                            temp.setStatus(HouseUtil.readStatus());
                            System.out.print("请输入安全密码(回车默认)");
                            temp.setPassword(HouseUtil.readString((byte) 20, temp.getPassword()));
                            System.out.println("修改成功!");
                            HouseView.printPrefix();
                            System.out.println(temp);
                            return;
                        }
                        if (pas.equals("-1"))
                            return;
                        System.out.println("密码错误，请重新输入(输入-1取消):");
                    }


                }
            }
        }
        System.out.println("未查找到有效房屋");
    }
}
