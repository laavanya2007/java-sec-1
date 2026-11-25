import java.util.*;

public class P21_RunningSum {
    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) nums[i] += nums[i - 1];
        return nums;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Running Sum of 1d Array (LeetCode 1480)");
        check(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})), "[1, 3, 6, 10]");
        if (failed > 0) System.exit(1);
    }
}
