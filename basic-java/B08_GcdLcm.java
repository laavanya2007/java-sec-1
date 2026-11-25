public class B08_GcdLcm {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int x = a, y = b;
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;
        System.out.println("GCD = " + gcd + ", LCM = " + lcm);
    }
}
