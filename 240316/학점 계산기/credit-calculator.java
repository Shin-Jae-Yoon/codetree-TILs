import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] scores = new double[n + 1];
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }

        double avg = sum / n;

        System.out.printf("%.1f\n", avg);

        if (avg >= 4.0) {
            System.out.print("Perfect");
        } else if (avg >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }
    }
}