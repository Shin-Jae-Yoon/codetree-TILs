import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sequenceNum(n));
    }

    private static int sequenceNum(int n) {
        if (n == 1) {
            return 2;
        }

        if (n == 2) {
            return 4;
        }

        return sequenceNum(n - 1) * sequenceNum(n - 2) % 100;
    }
}