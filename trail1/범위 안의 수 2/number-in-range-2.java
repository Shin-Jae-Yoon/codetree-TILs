import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            int input = sc.nextInt();

            if (input >= 0 && input <= 200) {
                sum += input;
                count++;
            }
        }

        double avg = (double) sum / count;

        System.out.printf("%d %.1f", sum, avg);
    }
}