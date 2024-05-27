import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = calculator(n);
        System.out.print(result);
    }

    private static int calculator(int n) {
        if (n < 10) {
            return n * n;
        }

        return calculator(n / 10) + (n % 10) * (n % 10);
    }
}