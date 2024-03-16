import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[10 + 1];

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();
        }

        System.out.print(input[3] + input[5] + input[10]);
    }
}