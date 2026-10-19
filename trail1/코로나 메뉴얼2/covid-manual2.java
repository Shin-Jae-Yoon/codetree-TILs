import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[120];
        
        for (int i = 1; i <= 3; i++) {
            char symptoms = sc.next().charAt(0);
            int temperature = sc.nextInt();
            
            if (symptoms == 'Y' && temperature >= 37) {
                countArr['A']++;
            }

            if (symptoms == 'N' && temperature >= 37) {
                countArr['B']++;
            }

            if (symptoms == 'Y' && temperature < 37) {
                countArr['C']++;
            }

            if (symptoms == 'N' && temperature < 37) {
                countArr['D']++;
            }
        }

        for (int i = 'A'; i <= 'D'; i++) {
            System.out.print(countArr[i] + " ");
        }

        if (countArr['A'] >= 2) {
            System.out.print("E");
        }
    }
}