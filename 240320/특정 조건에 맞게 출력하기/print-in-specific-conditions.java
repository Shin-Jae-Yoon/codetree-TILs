import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[101];
        int index = 1;

        while(true) {
            input[index] = sc.nextInt();

            if (input[index] == 0) {
                break;
            }

            index++;
        }

        for (int i = 1; i < index; i++) {
            if (input[i] % 2 == 1) {
                System.out.print(input[i] + 3 + " ");
            } else {
                System.out.print(input[i] / 2 + " ");
            }
        }
    }
}