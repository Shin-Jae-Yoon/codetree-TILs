import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char first = sc.next().charAt(0);
        char second = sc.next().charAt(0);

        int sum = (int)first + (int)second;
        int subtraction = (int)first - (int)second;

        if (subtraction < 0) {
            subtraction *= -1;
        }

        System.out.print(sum + " " + subtraction); 
    }
}