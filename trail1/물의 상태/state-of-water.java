import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("ice");
        }

        if (n >= 100) {
            System.out.println("vapor");
        }

        if (n >= 0 && n < 100) {
            System.out.println("water");
        }
    }
}