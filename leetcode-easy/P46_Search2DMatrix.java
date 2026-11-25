import java.util.*;

public class P46_Search2DMatrix {
    static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix)
            for (int val : row)
                if (val == target) return true;
        return false;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Search a 2D Matrix II - nested loops (LeetCode 240)");
        int[][] m = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        check(searchMatrix(m, 5), true);
        check(searchMatrix(m, 20), false);
        if (failed > 0) System.exit(1);
    }
}
