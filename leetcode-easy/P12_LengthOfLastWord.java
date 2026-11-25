import java.util.*;

public class P12_LengthOfLastWord {
    static int lengthOfLastWord(String s) {
        int i = s.length() - 1, length = 0;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Length of Last Word (LeetCode 58)");
        check(lengthOfLastWord("Hello World"), 5);
        check(lengthOfLastWord("   fly me   to   the moon  "), 4);
        if (failed > 0) System.exit(1);
    }
}
