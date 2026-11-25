import java.util.*;

public class P29_HighestAltitude {
    static int largestAltitude(int[] gain) {
        int altitude = 0, max = 0;
        for (int g : gain) {
            altitude += g;
            max = Math.max(max, altitude);
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
        System.out.println("Find the Highest Altitude (LeetCode 1732)");
        check(largestAltitude(new int[]{-5, 1, 5, 0, -7}), 1);
        check(largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}), 0);
        if (failed > 0) System.exit(1);
    }
}
