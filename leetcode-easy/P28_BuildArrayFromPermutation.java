import java.util.*;

public class P28_BuildArrayFromPermutation {
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) ans[i] = nums[nums[i]];
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Build Array from Permutation (LeetCode 1920)");
        check(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})), "[0, 1, 2, 4, 5, 3]");
        if (failed > 0) System.exit(1);
    }
}
