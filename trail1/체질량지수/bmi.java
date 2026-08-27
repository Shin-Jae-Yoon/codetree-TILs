import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        double bmi = (10_000 * w) / (h * h);

        System.out.printf("%.0f\n", bmi);
        
        if (bmi >= 25.0) {
            System.out.println("Obesity");
        }
    }
}