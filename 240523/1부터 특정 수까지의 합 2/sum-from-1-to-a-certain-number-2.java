import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = calculator(n);

        System.out.println(result);
    }

    private static int calculator(int n) {
        if (n == 0) {
            return 0;
        }

        return calculator(n - 1) + n;
    }
}