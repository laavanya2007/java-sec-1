import java.util.*;

public class P37_BuyAndSellStock {
    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, best = 0;
        for (int p : prices) {
            if (p < minPrice) minPrice = p;
            else best = Math.max(best, p - minPrice);
        }
        return best;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Best Time to Buy and Sell Stock (LeetCode 121)");
        check(maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
        check(maxProfit(new int[]{7, 6, 4, 3, 1}), 0);
        if (failed > 0) System.exit(1);
    }
}
