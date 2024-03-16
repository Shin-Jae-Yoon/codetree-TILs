import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passCount = 0;

        for (int i = 1; i <= n; i++) {
            int[] input = new int[4 + 1];
            int sum = 0;
            
            for (int j = 1; j <= 4; j++) {
                input[j] = sc.nextInt();
                sum += input[j];
            }

            double avg = (double) sum / 4;

            if (avg >= 60) {
                System.out.println("pass");
                passCount++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(passCount);
    }
}