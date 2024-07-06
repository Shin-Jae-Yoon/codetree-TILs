import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 1;
            }
        }

        if (cnt == 1 && max == 0) {
            max = 1;
        }

        System.out.print(max);
    }
}