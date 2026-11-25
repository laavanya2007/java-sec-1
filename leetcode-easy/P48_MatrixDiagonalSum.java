import java.util.*;

public class P48_MatrixDiagonalSum {
    static int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            if (i != n - 1 - i) sum += mat[i][n - 1 - i];
        }
        return sum;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Matrix Diagonal Sum (LeetCode 1572)");
        check(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), 25);
        check(diagonalSum(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}), 8);
        if (failed > 0) System.exit(1);
    }
}
