import java.util.Scanner;

public class Main {
    private static final int MAX_N = 10;

    private static int[] arr = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(getLCMAll(n));
    }

    private static int getLCMAll(int index) {
        if (index == 1) {
            return arr[1];
        }

        return lcm(getLCMAll(index - 1), arr[index]);
    }

    private static int lcm(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return a * b / gcd;
    }
}