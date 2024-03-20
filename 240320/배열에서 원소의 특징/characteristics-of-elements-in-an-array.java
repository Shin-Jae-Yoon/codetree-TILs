import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[11];

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (input[i] % 3 == 0) {
                System.out.print(input[i - 1]);
                break;
            }
        }
    }
}