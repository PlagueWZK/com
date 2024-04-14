package wzk.test;

public class TimeCurrent {
    public static void main(String[] args) {
        String string = "";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        final int COUNT = 200000;
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            string += i;
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringBuffer.append(i);
        }
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);
        long time5 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringBuilder.append(i);
        }
        long time6 = System.currentTimeMillis();
        System.out.println(time6 - time5);

    }
}
