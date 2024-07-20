import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 동 남 서 북
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        // 현재 북쪽 방향
        int directionNumber = 3;

        // 현재 위치
        int x = 0;
        int y = 0;
        int elapsedTime = 0;
        int result = -1;

        for (int i = 0; i < input.length(); i++) {
            char command = input.charAt(i);

            switch (command) {
                case 'F':
                    x += dx[directionNumber];
                    y += dy[directionNumber];
                    break;
                case 'R':
                    directionNumber = (directionNumber + 1) % 4;
                    break;
                case 'L':
                    directionNumber = (directionNumber - 1 + 4) % 4;
                    break;
            }

            elapsedTime++;

            if (x == 0 && y == 0) {
                result = elapsedTime;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);

        System.out.print(sb.toString());
    }
}