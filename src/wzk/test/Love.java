package wzk.test;

public class Love {
    public static void main(String[] args) {
        O.o("尊嘟假嘟?");
    }

}

class O {
    public static void o(String str) {
        int i, k, n = 0, x = 0, y;
        LOVE();
        for (i = 0; i < 5; i++) {
            y = 50;
            y = y - i * 2;
            n++;
            for (k = 0; k < n; k++) {
                System.out.print(" ");
            }
            while (true) {
                if (x < y) {
                    System.out.print("l");
                    y--;
                } else
                    break;
                if (x < y) {
                    System.out.print("o");
                    y--;
                } else
                    break;
                if (x < y) {
                    System.out.print("v");
                    y--;
                } else
                    break;
                if (x < y) {
                    System.out.print("e");
                    y--;
                } else
                    break;
            }
            System.out.println();
        }


        for (i = 0, n = 3; i < 10; i++) {
            y = 37;
            y = y - i * 4;
            n++;
            for (k = 0; k < n; k++) {
                System.out.print("  ");
            }
            while (true) {
                if (x < y) {
                    System.out.print("l");
                    y--;
                } else
                    break;
                if (x < y) {
                    System.out.print("o");
                    y--;
                } else
                    break;
                if (x < y) {
                    System.out.print("v");
                    y--;
                } else
                    break;
                if (x < y) {
                    System.out.print("e");
                    y--;
                } else
                    break;
            }
            System.out.println();
        }

        System.out.print("\n\n");
        System.out.println("只献给你 QAQ" + str);
    }

    public static void LOVE() {
        System.out.print("\n\n\n\n\n");
        System.out.println("         lovelove                   lovelove");
        System.out.println("       lovelovelove               lovelovelove");
        System.out.println("     lovelovelovelove           lovelovelovelove");
        System.out.println("   lovelovelovelovelove       lovelovelovelovelove");
        System.out.println("  lovelovelovelovelovelo     lovelovelovelovelovelo");
        System.out.println(" lovelovelovelovelovelove   lovelovelovelovelovelov");
        for (int i = 0; i < 2; i++) {
            System.out.println("lovelovelovelovelovelovelovelovelovelovelovelovelove");

        }
    }
}