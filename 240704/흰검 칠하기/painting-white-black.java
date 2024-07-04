import java.util.Scanner;

public class Main {
    public static final int MAX_K = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] checked = new int[2 * MAX_K + 1];
        int[] countBlack = new int[2 * MAX_K + 1];
        int[] countWhite = new int[2 * MAX_K + 1];
        int current = MAX_K;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);

            if (direction == 'R') {
                for (int j = current; j < current + x; j++) {
                    checked[j] = 1;
                    countBlack[j]++;
                }
                current = current + x - 1;
            }   

            if (direction == 'L') {
                for (int j = current; j > current - x; j--) {
                    checked[j] = 2;
                    countWhite[j]++;
                }
                current = current - x + 1;
            }
        }

        int white = 0;
        int black = 0;
        int gray = 0;

        for (int i = 0; i <= 2 * MAX_K; i++) {
            if (countBlack[i] >= 2 && countWhite[i] >= 2) {
                gray++;
            }
            else if (checked[i] == 1) {
                black++;
            }
            else if (checked[i] == 2) {
                white++;
            }
        }

        System.out.print(white + " " + black + " " + gray);
    }
}