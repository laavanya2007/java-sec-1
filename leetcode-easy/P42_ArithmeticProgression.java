import java.util.*;

public class P42_ArithmeticProgression {
    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++)
            if (arr[i] - arr[i - 1] != diff) return false;
        return true;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Can Make Arithmetic Progression From Sequence (LeetCode 1502)");
        check(canMakeArithmeticProgression(new int[]{3, 5, 1}), true);
        check(canMakeArithmeticProgression(new int[]{1, 2, 4}), false);
        if (failed > 0) System.exit(1);
    }
}
