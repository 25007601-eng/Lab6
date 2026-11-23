public class Question2 {
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            multiPrint(i, '*');
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            multiPrint(n - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
    }
}
