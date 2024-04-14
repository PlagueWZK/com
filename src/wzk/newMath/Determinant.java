package wzk.newMath;


public class Determinant {
    private final double[][] double_det;
    private final double result;
    private final String fraction_result;
    private final int N;

    public Determinant(double[][] double_det) {
        this.double_det = double_det;
        this.result = calResult(double_det);
        this.fraction_result = Fraction.fractionFormat(result,1) ;
        this.N = double_det.length;
    }

    public Determinant(double... t_det) {
        int n = 0;
        this.N = (int) Math.sqrt(t_det.length);
        this.double_det = new double[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                double_det[i][j] = t_det[n++];
            }
        }
        this.result = calResult(double_det);
        this.fraction_result = Fraction.fractionFormat(result,1) ;
    }

    public static double calResult(double[][] det) {
        int n = det.length;
        if (n == 1) return det[0][0];
        if (n == 2) return det[0][0] * det[1][1] - det[0][1] * det[1][0];
        double sum = 0;
        for (int j = 0; j < n; j++) {
            double[][] newDet = new double[n - 1][n - 1];
            for (int i1 = 1, rowIndex = 0; i1 < n; i1++) {
                for (int j1 = 0, colIndex = 0; j1 < n; j1++) {
                    if (j1 == j) continue;
                    newDet[rowIndex][colIndex++] = det[i1][j1];
                }
                rowIndex++;
            }
            sum += det[0][j] * Math.pow(-1, 1 + j) * calResult(newDet);
        }
        return sum;
    }

    public static int getMaximumBits(double[][] det) {
        int length, maxBits = 0;
        for (double[] I :
                det) {
            length = mathUtil.getMaximumBits(I);
            if (length > maxBits) maxBits = length;
        }
        return maxBits;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int maxBits = getMaximumBits(double_det);
        for (double[] I : double_det) {
            builder.append("|");
            int length = I.length;
            for (int i = 0; i < length; i++) {
                builder.append(mathUtil.figureFormatter(I[i], maxBits));
                if (i != length - 1) builder.append("    ");
            }
            builder.append("|").append("\n");
        }
        return String.valueOf(builder);
    }

    public String getDoubleResult() {
        return this.fraction_result;
    }

    public double getResult() {
        return result;
    }
}
