import java.util.*;

public class P43_AverageSalary {
    static double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Average Salary Excluding the Minimum and Maximum Salary (LeetCode 1491)");
        check(average(new int[]{4000, 3000, 1000, 2000}), 2500.0);
        check(average(new int[]{1000, 2000, 3000}), 2000.0);
        if (failed > 0) System.exit(1);
    }
}
