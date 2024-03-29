import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] countArr = new int[1001];

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            countArr[num]++;
        }

        int maxVal = Integer.MIN_VALUE;

        for (int i = 1; i < countArr.length; i++) {
            if (maxVal <= i && countArr[i] == 1) {
                maxVal = i;
            }
        }

        if (maxVal > 0) {
            System.out.print(maxVal);
        } else {
            System.out.print(-1);
        }
    }
}