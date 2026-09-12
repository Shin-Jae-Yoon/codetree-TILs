import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10 + 1];
        int zeroPosition = 11;

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                zeroPosition = i;
                break;
            }
        }

        int count = 0;
        int sum = 0;

        for (int i = 1; i < zeroPosition; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }

        System.out.printf("%d %d", count, sum);
    }
}