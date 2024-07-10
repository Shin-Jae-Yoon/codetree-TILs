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

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 1; j <= t; j++) {
                positionA[timeA] = positionA[timeA - 1] + v;
                timeA++;
            }
        }

        int timeB = 1;

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 1; j <= t; j++) {
                positionB[timeB] = positionB[timeB - 1] + v;
                timeB++;
            }
        }

        // A가 선두이면 1, B가 선두이면 2
        // 0이면 공동 선두
        int leader = 0;
        int changeCount = 0;

        for (int time = 1; time < timeA; time++) {
            if (positionA[time] > positionB[time]) {
                if (leader == 2) {
                    changeCount++;
                }

                leader = 1;
            }
            
            if (positionA[time] < positionB[time]) {
                if (leader == 1) {
                    changeCount++;
                }

                leader = 2;
            }

            if (positionA[time] == positionB[time]) {
                changeCount++;
            }
        }

        System.out.print(changeCount);
    }
}