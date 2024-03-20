import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = new char[11];

        for (int i = 1; i <= 10; i++) {
            input[i] = sc.next().charAt(0);
        }

        System.out.print(input[2] + " " + input[5] + " " + input[8]);
    }
}