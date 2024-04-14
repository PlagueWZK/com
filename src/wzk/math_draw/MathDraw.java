package wzk.math_draw;

import java.util.Scanner;

public class MathDraw {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("模式:一次函数(y = k * x + b)");
        System.out.print("k = ");

        double k = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        Function.functionsWriteIn(k, b);
        Function f = Function.getFunctions()[Function.getFunctions().length - 1];
        System.out.println(f);
        Point.printGraphics(f);
    }
}

class Function {
    double k;
    double b;
    double yMaxValue;
    double yMinValue;
    static Function[] functions = new Function[0];


    public Function(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public static Function[] getFunctions() {
        return functions;
    }

    public static void functionsArrayExpansion() {
        Function[] temp = new Function[functions.length + 1];
        System.arraycopy(functions, 0, temp, 0, functions.length);
        functions = temp;
    }

    public static void functionsWriteIn(double k, double b) {
        functionsArrayExpansion();
        int index = functions.length - 1;
        functions[index] = new Function(k, b);
    }

    @Override
    public String toString() {
        return "y = " + this.k + " * x + " + this.b;
    }
}

class Point {
    static final int A = -60;
    static final int B = 60;
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static void calExtremeValue(Function f) {
        double a = f.k * A + f.b;
        double b = f.k * B + f.b;
        if (a >= b) {
            f.yMaxValue = a;
            f.yMinValue = b;
        } else {
            f.yMaxValue = b;
            f.yMinValue = a;
        }
    }
    public static void printGraphics(Function f) {
        calExtremeValue(f);
        for (int i = (int)Math.round(f.yMaxValue); i >= f.yMinValue; i --) {
            for (int j = A; j <= B; j++) {
                if (isThePointOnTheLine(f,j,i)) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static boolean isThePointOnTheLine(Function f, int j, int i) {
        return (j == Math.round((i - f.b)/f.k));
    }
}
