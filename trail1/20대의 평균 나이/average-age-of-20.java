import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int age = sc.nextInt();
            
            if (age < 20 || age >= 30) {
                break;
            }

            sum += age;
            count++;
        }

        System.out.printf("%.2f", (double) sum / count);
    }
}