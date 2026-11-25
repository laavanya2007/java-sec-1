import java.util.*;

public class P41_AssignCookies {
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        for (int i = 0; i < s.length && child < g.length; i++) {
            if (s[i] >= g[child]) child++;
        }
        return child;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Assign Cookies (LeetCode 455)");
        check(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}), 1);
        check(findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}), 2);
        if (failed > 0) System.exit(1);
    }
}
