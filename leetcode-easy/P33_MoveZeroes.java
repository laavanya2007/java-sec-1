import java.util.*;

public class P33_MoveZeroes {
    static void moveZeroes(int[] nums) {
        int k = 0;
        for (int n : nums) if (n != 0) nums[k++] = n;
        while (k < nums.length) nums[k++] = 0;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Move Zeroes (LeetCode 283)");
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        check(Arrays.toString(nums), "[1, 3, 12, 0, 0]");
        if (failed > 0) System.exit(1);
    }
}
