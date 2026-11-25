import java.util.*;

public class P07_CommonFactors {
    static int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) count++;
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
        System.out.println("Number of Common Factors (LeetCode 2427)");
        check(commonFactors(12, 6), 4);
        check(commonFactors(25, 30), 2);
        if (failed > 0) System.exit(1);
    }
}
