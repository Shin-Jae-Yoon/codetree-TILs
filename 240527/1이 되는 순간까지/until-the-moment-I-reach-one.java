import java.util.Scanner;

public class Main {
    private static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculator(n);
        System.out.println(cnt);
    }

    private static int calculator(int n) {
        if (n == 1) {
            return 0;
        } else {
            cnt++;
        }

        if (n % 2 == 0) {
            return calculator(n / 2);
        } else {
            return calculator(n / 3);
        }
    }
}