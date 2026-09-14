import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i - 1]);
                break;
            }
        }
    }
}