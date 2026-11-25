import java.util.*;

public class P30_PivotIndex {
    static int pivotIndex(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Find Pivot Index (LeetCode 724)");
        check(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}), 3);
        check(pivotIndex(new int[]{1, 2, 3}), -1);
        if (failed > 0) System.exit(1);
    }
}
