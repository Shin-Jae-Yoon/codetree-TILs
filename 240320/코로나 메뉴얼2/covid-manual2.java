import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[5];

        for (int i = 1; i <= 3; i++) {
            char covid = sc.next().charAt(0);
            int tempertaure = sc.nextInt();

            if (covid == 'Y' && tempertaure >= 37) {
                count[1]++;
            } else if (covid == 'N' && tempertaure >= 37) {
                count[2]++;
            } else if (covid == 'Y' && tempertaure < 37) {
                count[3]++;
            } else {
                count[4]++;
            }
        }

        for (int i = 1; i <= 4; i++) {
            System.out.print(count[i] + " ");
        }

        if (count[1] >= 2) {
            System.out.print("E");
        }
    }
}