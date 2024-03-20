import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];
        int[] count = new int[10];

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            count[input[i]]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(count[i]);
        }
    }
}