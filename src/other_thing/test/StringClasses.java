package other_thing.test;

public class StringClasses {
    public static void main(String[] args) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = 0L;
        long endTime = 0L;
        final int Number = 500000;
        int i;
        startTime = System.currentTimeMillis();
        for (i=0; i < Number; i++) {
            str += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        for (i=0; i < Number; i++) {
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (i=0; i < Number; i++) {
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder " + (endTime - startTime));
    }
}
