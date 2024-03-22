import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (input[i] < input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        System.out.print(input[1] + " " + input[2]);
    }
}