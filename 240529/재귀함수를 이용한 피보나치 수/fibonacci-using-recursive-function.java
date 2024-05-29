import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibonach(n));
    }

    private static int fibonach(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }

        return fibonach(n - 1) + fibonach(n - 2);
    }
}