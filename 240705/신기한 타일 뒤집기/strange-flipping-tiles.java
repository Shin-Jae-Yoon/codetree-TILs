import java.util.Scanner;

public class Main {
    public static final int MAX_R = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 기본, 0, 회색
        int[] tiles = new int[2 * MAX_R + 1];
        int[] blackTiles = new int[2 * MAX_R + 1];
        int[] whiteTiles = new int[2 * MAX_R + 1];

        // 현재 위치 (OFFSET 더한걸로 계산)
        int current = 100000;

        int blackCount = 0;
        int whiteCount = 0;
        
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            char direction = sc.next().charAt(0);

            // 오른쪽, 1, 검은색
            if (direction == 'R') {
                for (int j = current; j < current + x; j++) {
                    tiles[j] = 1;
                    
                    if (whiteTiles[j] == 1) {
                        whiteTiles[j] = 0;
                    }

                    blackTiles[j] = 1;
                }

                current = current + x - 1;
            }

            // 왼쪽, 2, 흰색
            if (direction == 'L') {
                for (int j = current; j > current - x; j--) {
                    tiles[j] = 2;

                    if (blackTiles[j] == 1) {
                        blackTiles[j] = 0;
                    }

                    whiteTiles[j] = 1;
                }

                current = current - x + 1;
            }
        }

        for (int i = 1; i <= 2 * MAX_R; i++) {
            if (whiteTiles[i] == 1) {
                whiteCount++;
            }

            if (blackTiles[i] == 1) {
                blackCount++;
            }
        }
        
        // 마지막으로 뒤집은 타일 위치
        System.out.print(whiteCount + " " + blackCount);
    }
}