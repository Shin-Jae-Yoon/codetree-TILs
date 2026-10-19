import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] countArr = new int[10];

        while (true) {
            if (a <= 1) {
                break;
            }

            countArr[a % b]++;
            a /= b;
        }

        int result = 0;
        for (int i = 0; i <= 9; i++) {
            result += Math.pow(countArr[i], 2);
        }

        System.out.print(result);
    }
}