public class B05_ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse of " + n + " = " + rev);
    }
}
