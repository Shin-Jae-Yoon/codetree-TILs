import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (i >= 1 && arr[i] > t) {
                cnt++;
            } else {
                cnt = 0;
            }

            if (i == 0 && arr[0] > t) {
                cnt++;
            }

            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}