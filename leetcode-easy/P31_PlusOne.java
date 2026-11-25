import java.util.*;

public class P31_PlusOne {
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Plus One (LeetCode 66)");
        check(Arrays.toString(plusOne(new int[]{1, 2, 3})), "[1, 2, 4]");
        check(Arrays.toString(plusOne(new int[]{9, 9})), "[1, 0, 0]");
        if (failed > 0) System.exit(1);
    }
}
