import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        int count = 0;

        arr[1] = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            arr[i] = arr[i - 1] + arr[1];
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(arr[i] + " ");

            if (arr[i] % 5 == 0) {
                count++;
            }

            if (count >= 2) {
                break;
            }
        }
    }
}