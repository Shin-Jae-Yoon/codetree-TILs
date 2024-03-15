import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = new char[10];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[input.length - i - 1]);
        }
    }
}