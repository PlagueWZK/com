package wzk.house_rent;

public class HouseServe {
    private static final House[] houses = new House[0];

    public static House[] getHouses() {
        return houses;
    }

    public static void menu() {
        System.out.println("\t\t\t1增加房源");
        System.out.println("\t\t\t2");
        System.out.println("\t\t\t3");
        System.out.println("\t\t\t4");
        System.out.println("\t\t\t5");
        System.out.println("\t\t\t6退出");

    }

    public static void convert(int i) {
        switch (i) {
            case 1:
                addHouse();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                deleteHouse();
            case 6:
            default:
        }
    }

    public static void addHouse() {

    }

    public static void deleteHouse() {

    }
}
