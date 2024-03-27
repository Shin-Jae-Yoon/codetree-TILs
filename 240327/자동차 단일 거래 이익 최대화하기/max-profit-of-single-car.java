import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int maxVal = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (input[i] < input[j]) {
                    if (input[j] - input[i] > maxVal) {
                        maxVal = input[j] - input[i];
                    }
                }
            }
        }

        System.out.print(maxVal);
    }
}