import java.util.*;

public class P10_BinaryToInteger {
    static int getDecimalValue(int[] bits) {
        int result = 0;
        for (int bit : bits) {
            result = result * 2 + bit;
        }
        return result;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Convert Binary Number in a Linked List to Integer (LeetCode 1290, array version)");
        check(getDecimalValue(new int[]{1, 0, 1}), 5);
        check(getDecimalValue(new int[]{0}), 0);
        if (failed > 0) System.exit(1);
    }
}
