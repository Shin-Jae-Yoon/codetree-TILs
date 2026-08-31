import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            if (sum >= n) {
                result = i;
                break;
            }
        }

        System.out.print(result);
    }
}