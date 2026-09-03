import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(n - j + 1);
                }
            }

            System.out.println();
        }
    }
}