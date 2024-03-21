import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n + 1];

        int cnt = 0;
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();

            if (input[i] == 2) {
                cnt++;
            }

            if (cnt == 3) {
                idx = i;
                break;
            }
        }

        System.out.print(idx);
    }
}