import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int minVal = Integer.MAX_VALUE;
        
        for (int i = 0; i < n - 1; i++) {
            if (input[i + 1] - input[i] < minVal) {
                minVal = input[i + 1] - input[i];
            }
        }

        System.out.print(minVal);
    }
}