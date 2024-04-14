package wzk.math;

import java.util.Arrays;

public class Element {
    double[] data;
    double meanNumber;
    double variance;
    double sum = 0;
    String name;
    int group;
    boolean visible = true;
    public static int count = 0;

    public static int getCount() {
        return count;
    }

    public Element(String name, double[] data) {
        this.group = MainService.elements.length;
        this.data = data;
        this.name = name;
        this.calculate();
    }

    private void calculate() {
        int length = this.data.length;
        for (double value : this.data) {
            sum += value;
        }
        meanNumber = sum / length;
        double squareSum = 0;
        for (double value : this.data) {
            squareSum += Math.pow((value - this.meanNumber), 2);
        }
        variance = squareSum / length;
    }


    public String FormatToString() {
        return "\n组别:" + group +
                "\n名称:" + name +
                "\n数据组数据:" + Arrays.toString(data) +
                "\n数据量:" + data.length +
                "\nmeanNumber=" + meanNumber +
                "\nvariance=" + variance +
                "\nsum=" + sum +
                "\n";
    }

    @Override
    public String toString() {
        return "\n" + group + " " +
                name +
                ":{" +
                "data=" + Arrays.toString(data) +
                ", meanNumber=" + meanNumber +
                ", variance=" + variance +
                ", sum=" + sum +
                "}\n";
    }
}
