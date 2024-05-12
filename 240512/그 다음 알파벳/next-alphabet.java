import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        char result;

        if (input == 'z') {
            result = 'a';
        } else {
            result = (char)((int)input + 1);
        }

        System.out.print(result);
    }
}