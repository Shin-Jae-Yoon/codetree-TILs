import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        double widthSum = 0;
        double heightSum = 0;
        double entireSum = 0;

        for (int i = 0; i < 2; i++) {
            widthSum = 0;

            for (int j = 0; j < 4; j++) {
                widthSum += input[i][j];
            }

            System.out.printf("%.1f ", widthSum / 4);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            heightSum = 0;

            for (int j = 0; j < 2; j++) {
                heightSum += input[j][i];
            }

            System.out.printf("%.1f ", heightSum / 2);
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                entireSum += input[i][j];
            }
        }
        
        System.out.printf("%.1f", entireSum / 8);
    }
}