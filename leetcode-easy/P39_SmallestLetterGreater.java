import java.util.*;

public class P39_SmallestLetterGreater {
    static char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) if (c > target) return c;
        return letters[0];
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Find Smallest Letter Greater Than Target (LeetCode 744)");
        check(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'), 'c');
        check(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'), 'f');
        check(nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'), 'x');
        if (failed > 0) System.exit(1);
    }
}
