import java.util.Scanner;

public class Main {
    public static final int MAX_R = 1000000;
    public static int[] positionA = new int[MAX_R + 1];
    public static int[] positionB = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 로봇 A가 움직인 횟수 n
        int n = sc.nextInt();
        // 로봇 B가 움직인 횟수 m
        int m = sc.nextInt();

        int timeA = 1;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 1; j <= t; j++) {
                if (d == 'R') {
                    positionA[timeA] = positionA[timeA - 1] + 1;
                }

                if (d == 'L') {
                    positionA[timeA] = positionA[timeA - 1] - 1;
                }

                timeA++;
            }
        }

        int timeB = 1;

        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            for (int j = 1; j <= t; j++) {
                if (d == 'R') {
                    positionB[timeB] = positionB[timeB - 1] + 1;
                }

                if (d == 'L') {
                    positionB[timeB] = positionB[timeB - 1] - 1;
                }

                timeB++;
            }
        }

        if (timeA < timeB) {
            for (int i = timeA; i < timeB; i++) {
                positionA[i] = positionA[i - 1];
            }
        }

        if (timeA > timeB) {
            for (int i = timeB; i < timeA; i++) {
                positionB[i] = positionB[i - 1];
            }
        }

        int result = 0;
        int max = Math.max(timeA, timeB);

        for (int i = 1; i < max; i++) {
            if (positionA[i - 1] != positionB[i - 1] && positionA[i] == positionB[i]) {
                result++;
            }
        }

        System.out.print(result);
    }
}