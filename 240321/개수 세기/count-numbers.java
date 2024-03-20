import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input = new int[n + 1];
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            input[i] = sc.nextInt();
            
            if (input[i] == m) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}