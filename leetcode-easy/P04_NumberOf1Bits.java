import java.util.*;

public class P04_NumberOf1Bits {
    static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) count++;
            n = n / 2;
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
        System.out.println("Number of 1 Bits (LeetCode 191)");
        check(hammingWeight(11), 3);
        check(hammingWeight(128), 1);
        check(hammingWeight(2147483645), 30);
        if (failed > 0) System.exit(1);
    }
}
