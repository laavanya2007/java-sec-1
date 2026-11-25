import java.util.*;

public class P36_TwoSum {
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) return new int[]{i, j};
        return new int[]{};
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Two Sum - nested loops (LeetCode 1)");
        check(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)), "[0, 1]");
        check(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)), "[1, 2]");
        if (failed > 0) System.exit(1);
    }
}
