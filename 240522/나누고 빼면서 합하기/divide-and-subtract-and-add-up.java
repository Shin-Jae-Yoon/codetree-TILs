import java.util.Scanner;

public class Main {
    private static final int MAX_ARRAY_SIZE = 100;
    private static int[] arr = new int[MAX_ARRAY_SIZE];
    private static int n, m, sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (m > 0) {
            discriminator();
        }

        System.out.println(sum);
    }

    private static void discriminator() {
        if (m % 2 == 0) {
            evenCalculator();
        } else {
            oddCalculator();
        }
    }

    private static void evenCalculator() {
        sum += arr[m - 1];
        m /= 2;
    }

    private static void oddCalculator() {
        sum += arr[m - 1];
        m--;
    }
}