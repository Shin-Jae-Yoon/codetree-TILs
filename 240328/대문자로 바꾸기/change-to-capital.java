import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] input = new char[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = sc.next().charAt(0);
            }
        }
        int distance = 'a' - 'A';

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] -= distance;
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}