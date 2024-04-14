package wzk.newMath;

public class mathUtil {
    public static final int SCALE = 3;

    public static boolean isInteger(double number) {
        return (int) number == number;
    }

    public static String figureFormatter(double number, int scale) {
        if (isInteger(number)) return toString((int) number, scale);
        return mathUtil.toString(number, scale);
    }

    public static String figureFormatter(double number) {
        return figureFormatter(number, SCALE);
    }

    public static int calGreatestCommonDivisor(int a, int b) {
        if (b == 0) return a;
        return calGreatestCommonDivisor(b, a % b);
    }


    public static int calLeastCommonMultiple(int a, int b) {
        return a * b / calGreatestCommonDivisor(a, b);
    }

    public static String toString(double number, int scale) {
        return String.format("%" + scale + "." + bitsOfDecimal(number) + "f", number);
    }

    public static String toString(int number, int scale) {
        return String.format("%" + scale + "d", number);
    }

    public static String toString(double a) {
        return toString(a, SCALE);
    }

    public static int getMaximumBits(double... numbers) {
        int length, maxLength = 0;
        for (double value :
                numbers) {
            if (isInteger(value)) length = String.valueOf(((int) value)).length();
            length = String.valueOf(((int) value)).length();
            if (length > maxLength) maxLength = length;
        }
        return maxLength;
    }

    public static int bitsOfDecimal(double number) {
        String text = String.valueOf(number);
        return text.length() - text.indexOf('.') - 1;
    }
}
