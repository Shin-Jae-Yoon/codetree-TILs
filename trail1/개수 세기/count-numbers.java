import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] == m) {
                count++;
            }
        }

        System.out.print(count);
    }
}