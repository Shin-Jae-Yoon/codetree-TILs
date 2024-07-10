import java.util.Scanner;

public class Main {
    public static final int MAX_R = 1000000;
    public static int[] positionA = new int[MAX_R + 1];
    public static int[] positionB = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int timeA = 1;

        // A 이동
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 1; j <= t; j++) {
                positionA[timeA] = positionA[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;

        // B 이동
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 1; j <= t; j++) {
                positionB[timeB] = positionB[timeB - 1] + v;
                timeB++;
            }
        }

        // A 선두인 경우 1, B 선두인 경우 2
        int leader = 0;
        int result = 0;

        for (int i = 1; i < timeA; i++) {
            if (positionA[i] > positionB[i]) {
                if (leader == 2) {
                    result++;
                }

                leader = 1;
            }
            else if (positionA[i] < positionB[i]) {
                if (leader == 1) {
                    result++;
                }

                leader = 2;
            }
        }

        System.out.print(result);
    }
}