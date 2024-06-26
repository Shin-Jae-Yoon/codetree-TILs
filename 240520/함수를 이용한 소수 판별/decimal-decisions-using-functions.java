import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int n = a; n <= b; n++) {
            if (isPrime(n)) {
                sum += n;
            }
        }

        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}