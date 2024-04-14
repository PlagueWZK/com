package wzk.test;
import java.util.Scanner;
public class WangZhongRui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long bx = scanner.nextLong();
        long by = scanner.nextLong();
        long mx = scanner.nextLong();
        long my = scanner.nextLong();
        mx++;
        my++;
        long[][] f = new long[100][100];
        for (int i = 0; i < 8; i++) {
            if (mx + ma[i][0] > 0 && my + ma[i][1] > 0) {
                f[(int) (mx + ma[i][0])][(int) (my + ma[i][1])] = -1;
            }
        }
        f[(int) mx][(int) my] = -1;
        f[1][1] = 1;
        for (int i = 1; i <= bx + 1; i++) {
            for (int j = 1; j <= by + 1; j++) {
                if (f[i][j] != -1) {
                    if (i == 1 && j == 1) continue;
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                    if (f[i - 1][j] == -1) f[i][j]++;
                    if (f[i][j - 1] == -1) f[i][j]++;
                }
            }
        }
        System.out.println(f[(int) (bx + 1)][(int) (by + 1)] != -1 ? f[(int) (bx + 1)][(int) (by + 1)] : 0);
    }

    static int[][] ma = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
}

