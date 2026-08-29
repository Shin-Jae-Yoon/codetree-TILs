import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int middleScore = sc.nextInt();
        int finalScore = sc.nextInt();
        boolean middlePass = middleScore >= 90;
        
        if (middlePass) {
            if (finalScore >= 95) {
                System.out.println(100000);
                return;
            }
            
            if (finalScore >= 90) {
                System.out.println(50000);
                return;
            }
        }

        System.out.println(0);
    }
}