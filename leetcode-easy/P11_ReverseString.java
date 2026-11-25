import java.util.*;

public class P11_ReverseString {
    static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Reverse String (LeetCode 344)");
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        check(new String(s), "olleh");
        if (failed > 0) System.exit(1);
    }
}
