import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 동 서 남 북
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        int positionX = 0;
        int positionY = 0;
        
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            int directionNumber = 0;

            switch (direction) {
                case 'E':
                    directionNumber = 0;
                    break;
                case 'W':
                    directionNumber = 1;
                    break;
                case 'S':
                    directionNumber = 2;
                    break;
                case 'N':
                    directionNumber = 3;
                    break;
            }

            positionX = positionX + (distance * dx[directionNumber]);
            positionY = positionY + (distance * dy[directionNumber]);
        }

        System.out.print(positionX + " " + positionY);
    }
}