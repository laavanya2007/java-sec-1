import java.util.*;

public class P22_RichestCustomerWealth {
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) sum += money;
            max = Math.max(max, sum);
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
        System.out.println("Richest Customer Wealth (LeetCode 1672)");
        check(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}), 6);
        check(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}), 10);
        if (failed > 0) System.exit(1);
    }
}
