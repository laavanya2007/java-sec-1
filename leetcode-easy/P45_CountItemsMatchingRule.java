import java.util.*;

public class P45_CountItemsMatchingRule {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int col = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        int count = 0;
        for (List<String> item : items)
            if (item.get(col).equals(ruleValue)) count++;
        return count;
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Count Items Matching a Rule (LeetCode 1773)");
        List<List<String>> items = List.of(
            List.of("phone", "blue", "pixel"),
            List.of("computer", "silver", "lenovo"),
            List.of("phone", "gold", "iphone"));
        check(countMatches(items, "color", "silver"), 1);
        check(countMatches(items, "type", "phone"), 2);
        if (failed > 0) System.exit(1);
    }
}
