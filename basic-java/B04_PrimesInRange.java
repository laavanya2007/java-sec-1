public class B04_PrimesInRange {
    public static void main(String[] args) {
        System.out.print("Primes from 1 to 50: ");
        for (int n = 2; n <= 50; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(n + " ");
        }
        System.out.println();
    }
}
