import java.util.*;

public class P19_DefangIP {
    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    static int failed = 0;
    static void check(Object got, Object expected) {
        boolean ok = Objects.equals(got, expected);
        if (!ok) failed++;
        System.out.println((ok ? "PASS" : "FAIL") + "  got=" + got + "  expected=" + expected);
    }

    public static void main(String[] args) {
        System.out.println("Defanging an IP Address (LeetCode 1108)");
        check(defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
        check(defangIPaddr("255.100.50.0"), "255[.]100[.]50[.]0");
        if (failed > 0) System.exit(1);
    }
}
