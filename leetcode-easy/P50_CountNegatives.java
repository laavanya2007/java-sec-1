import java.util.*;

public class P50_CountNegatives {
    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid)
            for (int val : row)
                if (val < 0) count++;
        return count;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Count Negative Numbers in a Sorted Matrix - nested loops (LeetCode 1351)");
        check(countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}), 8);
        check(countNegatives(new int[][]{{3, 2}, {1, 0}}), 0);
        if (failed > 0) System.exit(1);
    }
}
