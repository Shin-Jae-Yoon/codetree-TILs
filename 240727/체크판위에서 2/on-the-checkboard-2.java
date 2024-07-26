import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st1.nextToken());
        char[][] matrix = new char[r][c];

        for (int i = 0; i < r; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < c; j++) {
                matrix[i][j] = st2.nextToken().charAt(0);
            }
        }

        int count = 0;

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {
                        if (matrix[0][0] != matrix[i][j] && 
                            matrix[i][j] != matrix[k][l] && 
                            matrix[k][l] != matrix[r - 1][c - 1]) {
                            count++;
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.print(sb.toString());
    }
}