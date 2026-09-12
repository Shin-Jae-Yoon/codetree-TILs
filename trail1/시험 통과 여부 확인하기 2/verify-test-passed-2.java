import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passCount = 0;

        for (int i = 1; i <= n; i++) {
            int firstScore = sc.nextInt();
            int secondScore = sc.nextInt();
            int thirdScore = sc.nextInt();
            int fourthScore = sc.nextInt();

            double avg = (double) (firstScore + secondScore + thirdScore + fourthScore) / 4;

            if (avg >= 60) {
                System.out.println("pass");
                passCount++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.print(passCount);
    }
}