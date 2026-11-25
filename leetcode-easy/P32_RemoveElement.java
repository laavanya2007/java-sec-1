import java.util.*;

public class P32_RemoveElement {
    static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) {
            if (n != val) nums[k++] = n;
        }
        return k;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Remove Element (LeetCode 27)");
        int[] nums = {3, 2, 2, 3};
        int k = removeElement(nums, 3);
        check(k, 2);
        check(Arrays.toString(Arrays.copyOf(nums, k)), "[2, 2]");
        if (failed > 0) System.exit(1);
    }
}
