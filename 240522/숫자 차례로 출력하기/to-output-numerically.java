import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        upRecursion(n);
        System.out.println();
        downRecursion(n);
    }

    private static void upRecursion(int n) {
        if (n == 0) {
            return;
        }

        upRecursion(n - 1);

        System.out.print(n + " ");
    }

    private static void downRecursion(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        downRecursion(n - 1);
    }
}