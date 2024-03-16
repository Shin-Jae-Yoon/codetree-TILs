import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = n; i >= 1; i--) {
            if (input[i] % 2 == 0) {
                System.out.print(input[i] + " ");
            }
        }
    }
}