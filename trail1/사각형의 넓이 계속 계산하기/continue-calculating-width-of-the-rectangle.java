import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            char condition = sc.next().charAt(0);

            System.out.println(w * h);

            if (condition == 'C') {
                break;
            }
        }
    }
}