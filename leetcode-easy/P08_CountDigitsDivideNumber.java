import java.util.*;

public class P08_CountDigitsDivideNumber {
    static int countDigits(int num) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (num % digit == 0) count++;
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
        System.out.println("Count Digits That Divide a Number - variant (practice)");
        check(countDigits(121), 2);
        check(countDigits(1248), 4);
        if (failed > 0) System.exit(1);
    }
}
