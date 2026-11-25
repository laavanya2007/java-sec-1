import java.util.*;

public class P17_ArrayStringsEqual {
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "", b = "";
        for (String w : word1) a += w;
        for (String w : word2) b += w;
        return a.equals(b);
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Check If Two String Arrays are Equivalent (LeetCode 1662)");
        check(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}), true);
        check(arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}), false);
        if (failed > 0) System.exit(1);
    }
}
