import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countNumber(n));
    }

    private static int countNumber(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            cnt++;
            return recursion(n / 2) + 1;
        }

        if (n % 2 == 1) {
            cnt++;
            return recursion(n * 3 + 1) + 1;
        }

        return 0;
    }
}