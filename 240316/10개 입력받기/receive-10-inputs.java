import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10 + 1];

        int sum = 0;
        int cnt = 0;

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (input[i] == 0) {
                break;
            }

            sum += input[i];
            cnt++;
        }

        double avg = (double)sum / cnt;

        System.out.printf("%d %.1f", sum, avg);
    }
}