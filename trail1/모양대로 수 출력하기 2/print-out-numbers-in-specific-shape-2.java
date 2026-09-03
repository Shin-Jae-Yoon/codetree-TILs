import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(even + " ");
                even += 2;

                if (even == 10) {
                    even = 2;
                }
            }

            System.out.println();
        }
    }
}