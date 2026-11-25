import java.util.*;

public class P25_KidsWithCandies {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) max = Math.max(max, c);
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) result.add(c + extraCandies >= max);
        return result;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Kids With the Greatest Number of Candies (LeetCode 1431)");
        check(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3).toString(), "[true, true, true, false, true]");
        if (failed > 0) System.exit(1);
    }
}
