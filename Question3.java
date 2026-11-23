import java.util.Scanner;

public class Question3 {
    public static void reverseNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int reverse = 0;

            while (num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            numbers[i] = reverse;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        reverseNumbers(numbers);

        System.out.println("Reversed numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
