import java.util.*;

public class P20_ToLowerCase {
    static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') sb.append((char) (c + 32));
            else sb.append(c);
        }
        return sb.toString();
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("To Lower Case (LeetCode 709)");
        check(toLowerCase("Hello"), "hello");
        check(toLowerCase("LOVELY"), "lovely");
        if (failed > 0) System.exit(1);
    }
}
