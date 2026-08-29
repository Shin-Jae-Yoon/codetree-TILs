import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i <= 100; i++) {
            if (i >= 90) {
                System.out.print("A ");
                continue;
            }

            if (i >= 80) {
                System.out.print("B ");
                continue;
            }

            if (i >= 70) {
                System.out.print("C ");
                continue;
            }

            if (i >= 60) {
                System.out.print("D ");
                continue;
            }

            System.out.print("F ");
        }
    }
}