import java.util.*;

public class P02_PalindromeNumber {
    static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        long reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return reversed == original;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Palindrome Number (LeetCode 9)");
        check(isPalindrome(121), true);
        check(isPalindrome(-121), false);
        check(isPalindrome(10), false);
        if (failed > 0) System.exit(1);
    }
}
