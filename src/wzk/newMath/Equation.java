package wzk.newMath;


import java.util.Arrays;


public class Equation {
    private static final char UNKNOWN = 'x';
    public final Determinant[] determinantForm;
    private final int countOfUnknowns;
    private final String presentationFormula;
    private final double[][][] coefficients;
    private final double[] constantTerm;
    private final String[] root;

    public Equation(double... numbers) {
        this.countOfUnknowns = (int) (Math.sqrt(numbers.length + 0.25) - 0.5);
        this.coefficients = new double[countOfUnknowns + 1][countOfUnknowns][countOfUnknowns];
        for (int i = 0; i < countOfUnknowns + 1; i++) {
            for (int j = 0, a = 0; j < countOfUnknowns; j++, a++) {
                for (int k = 0; k < countOfUnknowns; k++) {
                    this.coefficients[i][j][k] = numbers[a++];
                }
            }
        }
        this.constantTerm = new double[countOfUnknowns];
        for (int i = 0, a = countOfUnknowns; i < countOfUnknowns; i++, a += countOfUnknowns + 1) {
            this.constantTerm[i] = numbers[a];
        }
        for (int i = 0, id = 1; i < countOfUnknowns; i++) {
            replaceCeo(coefficients[id++], constantTerm, i);
        }
        this.determinantForm = new Determinant[countOfUnknowns + 1];
        for (int i = 0; i < countOfUnknowns + 1; i++) {
            this.determinantForm[i] = new Determinant(coefficients[i]);
        }
        this.root = new String[countOfUnknowns];
        for (int i = 0; i < countOfUnknowns; i++) {
            this.root[i] = Fraction.fractionFormat(determinantForm[i + 1].getResult(),determinantForm[0].getResult());
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < countOfUnknowns; i++) {
            for (int j = 0, a = 1; j < countOfUnknowns; j++) {
                str.append(equationFormatter(coefficients[0][i][j])).append(UNKNOWN).append(a++).append(" ");
                if (j != countOfUnknowns - 1) str.append("+ ");
            }
            str.append("= ").append(mathUtil.figureFormatter(constantTerm[i])).append("\n");
        }
        this.presentationFormula = str.toString();
    }

    public static String toCapitalForm(int N) {
        String[] emu = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String strNum = String.valueOf(N);
        int[] numbers = new int[strNum.length()];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < strNum.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            str.append(emu[numbers[i]]);
        }
        return str.toString();
    }

    public String equationFormatter(double number) {
        if (number == 1.0) return "";
        return mathUtil.figureFormatter(number);
    }

    private void replaceCeo(double[][] modified, double[] source, int column) {
        for (int i = 0; i < modified.length; i++) {
            modified[i][column] = source[i];
        }
    }

    public String getCoefficients() {
        return "Coefficient group : " + Arrays.deepToString(coefficients[0]) + "\nConstant term : " + Arrays.toString(constantTerm);
    }

    public String getPresentationFormula() {
        return presentationFormula;
    }

    public String getDeterminantForm() {
        StringBuilder str = new StringBuilder();
        for (Determinant value : determinantForm) {
            str.append(value).append("\n");
        }
        return str.toString();
    }

    public String getRoot() {
        if (determinantForm[0].getResult() == 0) {
            return "该" + toCapitalForm(countOfUnknowns) + "元线性方程组不存在唯一解";
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < countOfUnknowns; i++) {
            str.append(UNKNOWN).append(i + 1).append(" = ").append(root[i]).append("\n");
        }
        return str.toString();
    }
}