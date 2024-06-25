import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        int max = 0;

        for (int i = 0; i < n; i++) {
            int lastIndex = 2 * n - 1;

            if (input[i] == input[i + 1] || input[lastIndex - 1 - i] == input[lastIndex - i]) {
                continue;
            }

            int candidate = input[i] + input[2 * n - 1 - i];

            if (candidate >= max) {
                max = candidate;
            }
        }

        System.out.println(max);
    }
}