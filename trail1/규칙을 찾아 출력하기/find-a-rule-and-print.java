import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int r = 1; r <= n; r++) {

            if (r == 1 || r == n) {
                for (int c = 1; c <= n; c++) {
                    System.out.print("* ");
                }
            } else {
                for (int c = 1; c <= n; c++) {
                    if (c == n) {
                        System.out.print("* ");
                    } else if (r <= c) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }

            System.out.println();
        }
    }
}