import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] result = new int[n][m];
        int cnt = 1;

        for (int startCol = 0; startCol < m; startCol++) {
            int currentRow = 0;
            int currentCol = startCol;

            while (currentCol >= 0 && currentRow < n) {
                result[currentRow][currentCol] = cnt;

                currentRow++;
                currentCol--;
                cnt++;
            }
        }

        for (int startRow = 1; startRow < n; startRow++) {
            int currentRow = startRow;
            int currentCol = m - 1;

            while (currentCol >= 0 && currentRow < n) {
                result[currentRow][currentCol] = cnt;

                currentRow++;
                currentCol--;
                cnt++;          
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(result[row][col] + " ");
            }

            System.out.println();
        }
    }
}