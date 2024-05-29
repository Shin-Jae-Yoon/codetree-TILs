import java.util.Scanner;

public class Main {
    private static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursion(n);
        System.out.println(cnt);
    }

    private static int recursion(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            cnt++;
            return recursion(n / 2);
        }

        if (n % 2 == 1) {
            cnt++;
            return recursion(n * 3 + 1);
        }

        return 0;
    }
}