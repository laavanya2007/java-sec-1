import java.util.*;

public class P13_LongestCommonPrefix {
    static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Longest Common Prefix (LeetCode 14)");
        check(longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
        check(longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
        if (failed > 0) System.exit(1);
    }
}
