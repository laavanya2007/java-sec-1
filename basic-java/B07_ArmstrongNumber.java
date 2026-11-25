public class B07_ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int digits = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += (int) Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(n + (sum == n ? " is an Armstrong number" : " is not an Armstrong number"));
    }
}
