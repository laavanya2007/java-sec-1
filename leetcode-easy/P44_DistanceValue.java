import java.util.*;

public class P44_DistanceValue {
    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int a : arr1) {
            boolean ok = true;
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    ok = false;
                    break;
                }
            }
            if (ok) count++;
        }
        return count;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Find the Distance Value Between Two Arrays (LeetCode 1385)");
        check(findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2), 2);
        check(findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3), 2);
        if (failed > 0) System.exit(1);
    }
}
