import java.util.*;

public class P47_TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] ans = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                ans[j][i] = matrix[i][j];
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Transpose Matrix (LeetCode 867)");
        check(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})), "[[1, 4], [2, 5], [3, 6]]");
        if (failed > 0) System.exit(1);
    }
}
