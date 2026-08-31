import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            prod *= i;

            if (prod >= n) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}