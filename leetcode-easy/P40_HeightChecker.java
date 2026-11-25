import java.util.*;

public class P40_HeightChecker {
    static int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++)
            if (heights[i] != expected[i]) count++;
        return count;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Height Checker (LeetCode 1051)");
        check(heightChecker(new int[]{1, 1, 4, 2, 1, 3}), 3);
        check(heightChecker(new int[]{1, 2, 3, 4, 5}), 0);
        if (failed > 0) System.exit(1);
    }
}
