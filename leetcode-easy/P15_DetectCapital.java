import java.util.*;

public class P15_DetectCapital {
    static boolean detectCapitalUse(String word) {
        int caps = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) caps++;
        }
        return caps == word.length() || caps == 0
            || (caps == 1 && Character.isUpperCase(word.charAt(0)));
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Detect Capital (LeetCode 520)");
        check(detectCapitalUse("USA"), true);
        check(detectCapitalUse("Google"), true);
        check(detectCapitalUse("FlaG"), false);
        if (failed > 0) System.exit(1);
    }
}
