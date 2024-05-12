import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        int number = sc.nextInt();

        System.out.print((int)alphabet + " " + (char)number);
    }
}