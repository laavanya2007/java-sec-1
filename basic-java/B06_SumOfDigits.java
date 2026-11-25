public class B06_SumOfDigits {
    public static void main(String[] args) {
        int n = 9876;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + n + " = " + sum);
    }
}
