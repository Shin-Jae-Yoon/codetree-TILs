import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[11];

        int sum = 0;
        double avg = 0;
        int cnt = 0;

        for (int i = 1; i < input.length; i++) {
            input[i] = sc.nextInt();

            if (input[i] >= 250) {
                break;
            }

            sum += input[i];
            cnt++;
        }

        avg = (double)sum / cnt;

        System.out.printf("%d %.1f", sum, avg);
    }
}