import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstAge = sc.nextInt();
        String firstGender = sc.next();
        int secondAge = sc.nextInt();
        String secondGender = sc.next();

        boolean first = firstAge >= 19 && firstGender.equals("M");
        boolean second = secondAge >= 19 && secondGender.equals("M");

        if (first || second) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}