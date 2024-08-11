import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_N = 20;

    private static int n;
    private static int[][] matrix = new int[MAX_N][MAX_N];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;

        for (int firstRow = 0; firstRow < n; firstRow++) {
            for (int firstCol = 0; firstCol < n - 2; firstCol++) {
                for (int secondRow = 0; secondRow < n; secondRow++) {
                    for (int secondCol = 0; secondCol < n - 2; secondCol++) {
                        if (firstRow == secondRow && Math.abs(firstCol - secondCol) <= 2) {
                            continue;
                        }

                        int firstCount = matrix[firstRow][firstCol] + matrix[firstRow][firstCol + 1] + matrix[firstRow][firstCol + 2];
                        int secondCount = matrix[secondRow][secondCol] + matrix[secondRow][secondCol + 1] + matrix[secondRow][secondCol + 2];
                        max = Math.max(max, firstCount + secondCount);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max);
        System.out.print(sb.toString());
    }
}