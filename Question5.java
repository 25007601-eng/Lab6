import java.util.Scanner;

public class Question5 {
    public static boolean checkAnswer(int a, int b, int answer) {
        return a * b == answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        while (true) {
            int a = (int) (Math.random() * 13);
            int b = (int) (Math.random() * 13);

            System.out.println("Enter negative number to quit.");
            System.out.print(a + " x " + b + " = ");

            int answer = input.nextInt();

            if (answer < 0) {
                break;
            }

            if (checkAnswer(a, b, answer)) {
                score++;
            }
        }

        System.out.println("Your Score is " + score);

        input.close();
    }
}
