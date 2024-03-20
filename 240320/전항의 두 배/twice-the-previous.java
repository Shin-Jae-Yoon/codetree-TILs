import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[11];
        result[1] = sc.nextInt();
        result[2] = sc.nextInt();

        for (int i = 3; i <= 10; i++) {
            result[i] = result[i - 1] + 2 * result[i - 2];
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(result[i] + " ");
        }
    }
}