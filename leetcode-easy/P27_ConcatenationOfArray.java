import java.util.*;

public class P27_ConcatenationOfArray {
    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Concatenation of Array (LeetCode 1929)");
        check(Arrays.toString(getConcatenation(new int[]{1, 2, 1})), "[1, 2, 1, 1, 2, 1]");
        if (failed > 0) System.exit(1);
    }
}
