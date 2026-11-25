import java.util.*;

public class P35_MostWordsInSentence {
    static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            int words = 1;
            for (char c : s.toCharArray()) if (c == ' ') words++;
            max = Math.max(max, words);
        }
        return max;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Maximum Number of Words Found in Sentences (LeetCode 2114)");
        check(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}), 6);
        if (failed > 0) System.exit(1);
    }
}
