import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = calculator(a, b);

        System.out.print(result);
    }

    private static int calculator(int a, int b) {
        int n = 1;

        for (int i = 0; i < b; i++) {
            n *= a;
        }

        return n;
    }
}