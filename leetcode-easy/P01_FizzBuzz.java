import java.util.*;

public class P01_FizzBuzz {
    static String[] fizzBuzz(int n) {
        String[] ans = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) ans[i - 1] = "FizzBuzz";
            else if (i % 3 == 0) ans[i - 1] = "Fizz";
            else if (i % 5 == 0) ans[i - 1] = "Buzz";
            else ans[i - 1] = String.valueOf(i);
        }
        return ans;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Fizz Buzz (LeetCode 412)");
        check(Arrays.toString(fizzBuzz(15)),
              "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]");
        if (failed > 0) System.exit(1);
    }
}
