import java.util.Scanner;

public class Main {
    public static final int MAX_R = 1000000;
    public static int[] a = new int[MAX_R + 1];
    public static int[] b = new int[MAX_R + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int current = 0;
        int aTime = 0;
        int bTime = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int time = sc.nextInt();

            for (int j = 1; j <= time; j++) {
                if (direction == 'R') {
                    current++;
                }

                if (direction == 'L') {
                    current--;
                }

                aTime++;
                a[aTime] = current;
            }
        }

        current = 0;

        for (int i = 0; i < m; i++) {
            char direction = sc.next().charAt(0);
            int time = sc.nextInt();

            for (int j = 1; j <= time; j++) {
                if (direction == 'R') {
                    current++;
                }

                if (direction == 'L') {
                    current--;
                }

                bTime++;
                b[bTime] = current;
            }
        }

        int min = Math.min(aTime, bTime);
        int result = -1;

        for (int i = 1; i <= min; i++) {
            if (a[i] == b[i]) {
                result = i;
                break;
            }
        }

        System.out.print(result);

    }
}