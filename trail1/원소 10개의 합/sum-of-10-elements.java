import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10 + 1];
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 10; i++) {
            sum += arr[i];
        }

        System.out.print(sum);
    }
}