import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10 + 1];

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();

            if (input[i] == 0) {
                break;
            }
        }

        for (int i = 10; i >= 1; i--) {
            if (input[i] == 0) {
                continue;
            }

            System.out.print(input[i] + " ");
        }
    }
}