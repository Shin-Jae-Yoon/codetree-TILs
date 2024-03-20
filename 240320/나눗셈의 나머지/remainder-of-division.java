import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] count = new int[10];

        while(true) {
            count[a % b]++;
            a = a / b;

            if (a <= 1) {
                break;
            }
        }

        int sum = 0;

        for (int i = 0; i <= 9; i++) {
            sum += count[i] * count[i];
        }

        System.out.print(sum);
    }
}