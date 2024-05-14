import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        gcd(n, m);
    }

    private static void gcd(int n, int m) {
        int max = 1;

        for (int i = 2; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }

        System.out.print(max);
    }
}