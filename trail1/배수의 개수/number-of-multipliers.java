import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeCount = 0;
        int fiveCount = 0;

        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if (n % 3 == 0) {
                threeCount++;
            }

            if (n % 5 == 0) {
                fiveCount++;
            }
        }

        System.out.println(threeCount + " " + fiveCount);
    }
}