import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 4; i++) {
            for (int j = b; j >= a; j--) {
                System.out.printf("%d * %d = %d", j, i * 2, j * i * 2);

                if (j != a) {
                    System.out.print(" / ");
                }
            }

            System.out.println();
        }
    }
}