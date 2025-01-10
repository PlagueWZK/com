package wzk.newMath;


public class Fraction {
    public final double approximateValue;//近似值
    public int numerator;//分子
    public int denominator;//分母

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException("分母不能为0");
        this.numerator = numerator;
        this.denominator = denominator;
        reduction();
        approximateValue = (double) numerator / denominator;
    }
    public Fraction(double numerator, double denominator) {
        if (denominator == 0) throw new IllegalArgumentException("分母不能为0");
        while (!(mathUtil.isInteger(numerator) && mathUtil.isInteger(denominator))) {
            numerator *= 10;
            denominator *= 10;
        }
        this.numerator = (int)numerator;
        this.denominator = (int)denominator;
        reduction();
        approximateValue = numerator / denominator;
    }

    public static String fractionFormatter(double dividend, double divisor) {
        while (!(mathUtil.isInteger(dividend) && mathUtil.isInteger(divisor))) {
            dividend *= 10;
            divisor *= 10;
        }
        return (int)dividend + "/" + (int)divisor;
    }

    public Fraction add(Fraction other) {
        if (this.denominator == other.denominator) return new Fraction(this.numerator + other.numerator, denominator);
        return new Fraction(numerator * other.denominator + denominator * other.numerator, denominator * other.denominator).reduction();
    }

    public Fraction subtraction(Fraction other) {
        if (this.denominator == other.denominator) return new Fraction(this.numerator - other.numerator, denominator);
        return new Fraction(numerator * other.denominator - denominator * other.numerator, denominator * other.denominator).reduction();
    }

    public Fraction multiplication(Fraction other) {
        return new Fraction(numerator * other.numerator, denominator * other.denominator);
    }
    public Fraction Division(Fraction other) {
        return new Fraction(numerator * other.denominator, denominator * other.numerator);
    }
    public Fraction add(double other) {
        return new Fraction(numerator+= (int) (other * denominator),denominator);
    }

    public Fraction subtraction(double other) {
        return new Fraction(numerator-= (int) (other * denominator),denominator);
    }

    public Fraction multiplication(double other) {
        return  new Fraction(numerator * other, denominator);
    }
    public Fraction Division(double other) {
        return new Fraction(numerator / other, denominator);
    }
    public Fraction reduction() {
        int gcd = mathUtil.calGreatestCommonDivisor(denominator, numerator);
        denominator /= gcd;
        numerator /= gcd;
        return this;
    }

    @Override
    public String toString() {
            if (mathUtil.isInteger(approximateValue)) return String.valueOf((int)(approximateValue));
            return fractionFormatter(numerator,denominator);
    }
}
