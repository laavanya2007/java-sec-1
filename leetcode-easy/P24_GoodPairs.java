import java.util.*;

public class P24_GoodPairs {
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] == nums[j]) count++;
        return count;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Number of Good Pairs (LeetCode 1512)");
        check(numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}), 4);
        check(numIdenticalPairs(new int[]{1, 1, 1, 1}), 6);
        if (failed > 0) System.exit(1);
    }
}
