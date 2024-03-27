import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        int prevMaxIndex = n + 1;

        while (true) {
            int maxIndex = 1;

            for (int i = 2; i < prevMaxIndex; i++) {
                if (input[i] > input[maxIndex]) {
                    maxIndex = i;
                }
            }

            System.out.print(maxIndex + " ");

            if (maxIndex == 1) {
                break;
            }

            prevMaxIndex = maxIndex;
        }
    }
}