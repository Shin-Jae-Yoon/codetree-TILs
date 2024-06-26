import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        char alphabet = sc.next().charAt(0);
        
        int lenCnt = 0;
        int lenSum = 0;

        for (int i = 0; i < n; i++) {
            if (str[i].charAt(0) == alphabet) {
                lenCnt++;
                lenSum += str[i].length();
            }
        }

        double lenAvg = (double)lenSum / lenCnt;

        System.out.printf("%d %.2f", lenCnt, lenAvg);
    }
}