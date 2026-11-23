public class Question4 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println("GCD of 24 and 8: " + gcd(24, 8));
        System.out.println("GCD of 200 and 625: " + gcd(200, 625));
    }
}
