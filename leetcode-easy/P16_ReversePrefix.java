import java.util.*;

public class P16_ReversePrefix {
    static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;
        String prefix = new StringBuilder(word.substring(0, idx + 1)).reverse().toString();
        return prefix + word.substring(idx + 1);
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Reverse Prefix of Word (LeetCode 2000)");
        check(reversePrefix("abcdefd", 'd'), "dcbaefd");
        check(reversePrefix("abcd", 'z'), "abcd");
        if (failed > 0) System.exit(1);
    }
}
