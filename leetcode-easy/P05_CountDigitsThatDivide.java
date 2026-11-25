import java.util.*;

public class P05_CountDigitsThatDivide {
    static int countDigits(int num) {
        int count = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (num % digit == 0) count++;
            temp /= 10;
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
        System.out.println("Count the Digits That Divide a Number (LeetCode 2520)");
        check(countDigits(7), 1);
        check(countDigits(121), 2);
        check(countDigits(1248), 4);
        if (failed > 0) System.exit(1);
    }
}
