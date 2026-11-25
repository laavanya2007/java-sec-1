import java.util.*;

public class P26_ShuffleArray {
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
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
        System.out.println("Shuffle the Array (LeetCode 1470)");
        check(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)), "[2, 3, 5, 4, 1, 7]");
        if (failed > 0) System.exit(1);
    }
}
