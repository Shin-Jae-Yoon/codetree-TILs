import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[11];

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.nextInt();
        }

        int underMax = 0;
        int upperMin = 1001;

        for (int i = 1; i <= 10; i++) {
            if (input[i] < 500 && underMax < input[i]) {
                underMax = input[i];
            }

            if (input[i] > 500 && upperMin > input[i]) {
                upperMin = input[i];
            }
        }

        System.out.print(underMax + " " + upperMin);
    }
}