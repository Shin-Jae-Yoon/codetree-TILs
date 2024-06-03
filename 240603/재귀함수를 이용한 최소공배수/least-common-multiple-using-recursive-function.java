import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        System.out.print(lcm(input, n - 1, 1));
    }

    private static int lcm(int[] a, int n, int c) {
        if (n < 0) {
            return 1;
        }

        int i = 1;

        for (i = 1; i <= a[n]; i++) {
            if ((c * i) % a[n] == 0) {
                break;
            }
        }

        return lcm(a, n - 1, c * i) * i;
    }
}