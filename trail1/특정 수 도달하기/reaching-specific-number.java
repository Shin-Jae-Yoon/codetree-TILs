import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10 + 1];
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            if (arr[i] >= 250) {
                break;
            }

            sum += arr[i];
            count++;
        }

        System.out.printf("%d %.1f", sum, (double) sum / count);
    }
}