import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();

        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        int positionX = 0;
        int positionY = 0;
        int directionNumber = 3;

        for (int i = 0; i < len; i++) {
            char command = input.charAt(i);

            switch (command) {
                case 'R':
                    directionNumber = (directionNumber + 1) % 4;
                    break;
                case 'L':
                    directionNumber = (directionNumber - 1 + 4) % 4;
                    break;
                case 'F':
                    positionX += dx[directionNumber];
                    positionY += dy[directionNumber];
                    break;
            }
        }

        System.out.print(positionX + " " + positionY);
    }
}