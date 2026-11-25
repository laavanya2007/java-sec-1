import java.util.*;

public class P23_EvenDigitNumbers {
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            int digits = 0;
            while (n > 0) {
                digits++;
                n /= 10;
            }
            if (digits % 2 == 0) count++;
        }
        return count;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Find Numbers with Even Number of Digits (LeetCode 1295)");
        check(findNumbers(new int[]{12, 345, 2, 6, 7896}), 2);
        check(findNumbers(new int[]{555, 901, 482, 1771}), 1);
        if (failed > 0) System.exit(1);
    }
}
