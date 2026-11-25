import java.util.*;

public class P18_GoalParser {
    static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Goal Parser Interpretation (LeetCode 1678)");
        check(interpret("G()(al)"), "Goal");
        check(interpret("(al)G(al)()()G"), "alGalooG");
        if (failed > 0) System.exit(1);
    }
}
