public class Question6 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverse(int n) {
        int result = 0;

        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }

        return result;
    }

    public static boolean isPalindromicPrime(int n) {
        return isPrime(n) && n == reverse(n);
    }

    public static boolean isEmirp(int n) {
        return isPrime(n) && isPrime(reverse(n)) && n != reverse(n);
    }

    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("First 20 Palindromic Primes:");

        while (count < 20) {
            if (isPalindromicPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        count = 0;
        num = 2;

        System.out.println();
        System.out.println("First 20 Emirps:");

        while (count < 20) {
            if (isEmirp(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        System.out.println();
    }
}
