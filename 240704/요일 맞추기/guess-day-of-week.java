import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int diff = calculateTotal(m2, d2) - calculateTotal(m1, d1);
        
        while (diff < 0) {
            diff += 7;
        }

        String[] dayOfTheWeeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println(dayOfTheWeeks[diff % 7]);
    }

    private static int calculateTotal(int m, int d) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;

        for (int i = 1; i < m; i++) {
            totalDays += days[i];
        }

        totalDays += d;

        return totalDays;
    }
}