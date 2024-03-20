import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        int[] result = new int[n + 1];
        int resultIndex = 1;

        for (int i = 1; i <= n; i++) {
            if (input[i] % 2 == 0) {
                result[resultIndex] = input[i];
                resultIndex++;
            }
        }

        for (int i = 1; i < resultIndex; i++) {
            System.out.print(result[i] + " ");
        }
    }
}