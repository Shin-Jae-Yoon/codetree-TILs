import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numberOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int firstDaySum = 0;
        
        for (int i = 1; i < m1; i++) {
            firstDaySum += numberOfDays[i];
        }

        firstDaySum += d1;

        int secondDaySum = 0;

        for (int i = 1; i < m2; i++) {
            secondDaySum += numberOfDays[i];
        }

        secondDaySum += d2;

        System.out.println(secondDaySum - firstDaySum + 1);
    }
}