import java.util.*;

public class P14_ValidPalindrome {
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char a = s.charAt(left), b = s.charAt(right);
            if (!Character.isLetterOrDigit(a)) left++;
            else if (!Character.isLetterOrDigit(b)) right--;
            else {
                if (Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
                left++;
                right--;
            }
        }
        return true;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Valid Palindrome (LeetCode 125)");
        check(isPalindrome("A man, a plan, a canal: Panama"), true);
        check(isPalindrome("race a car"), false);
        if (failed > 0) System.exit(1);
    }
}
