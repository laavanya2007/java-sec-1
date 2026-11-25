import java.util.*;

public class P34_DifferenceOfTwoArrays {
    static boolean contains(int[] arr, int x) {
        for (int a : arr) if (a == x) return true;
        return false;
    }

    static List<Integer> onlyIn(int[] a, int[] b) {
        List<Integer> res = new ArrayList<>();
        for (int x : a) {
            if (!contains(b, x) && !res.contains(x)) res.add(x);
        }
        return res;
    }

    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(onlyIn(nums1, nums2));
        ans.add(onlyIn(nums2, nums1));
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Find the Difference of Two Arrays (LeetCode 2215)");
        check(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}).toString(), "[[1, 3], [4, 6]]");
        check(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}).toString(), "[[3], []]");
        if (failed > 0) System.exit(1);
    }
}
