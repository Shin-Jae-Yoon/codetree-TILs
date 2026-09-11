import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[9];
        double sum = 0;

        for (int i = 1; i <= 8; i++) {
            scores[i] = sc.nextDouble();
        }

        for (int i = 1; i <= 8; i++) {
            sum += scores[i];
        }

        System.out.printf("%.1f", sum / 8);
    }
}