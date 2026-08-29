import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score == 100) {
            System.out.println("pass");
        } else {
            System.out.println("failure");
        }
    }
}