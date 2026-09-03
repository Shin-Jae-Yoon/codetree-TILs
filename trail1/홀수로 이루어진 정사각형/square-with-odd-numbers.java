import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 11;
        int b = 11;

        for (int i = 1; i <= n; i++) {
            a = b;

            for (int j = 1 ; j<= n; j++) {
                System.out.print(a + " ");
                a += 2;

                if (j == 1) {
                    b = a;
                }
            }

            System.out.println();
        }
    }
}