import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = i; j <= 3 * i - 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            
            for (int j = i; j <= 3 * i - 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}