import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[6];

        for (int i = 1; i <= 5; i++) {
            input[i] = sc.nextInt();
        }

        boolean satisfied = true;

        for (int i = 1; i < input.length; i++) {
            if (input[i] % 3 != 0) {
                satisfied = false;
                break;
            }
        }

        if (satisfied == true) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}