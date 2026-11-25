import java.util.*;

public class P06_StepsToZero {
    static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) num /= 2;
            else num -= 1;
            steps++;
        }
        return steps;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Number of Steps to Reduce a Number to Zero (LeetCode 1342)");
        check(numberOfSteps(14), 6);
        check(numberOfSteps(8), 4);
        check(numberOfSteps(123), 12);
        if (failed > 0) System.exit(1);
    }
}
