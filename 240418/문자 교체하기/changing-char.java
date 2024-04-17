import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] firstInput = sc.next().toCharArray();
        char[] secondInput = sc.next().toCharArray();

        secondInput[0] = firstInput[0];
        secondInput[1] = firstInput[1];

        String result = String.valueOf(secondInput);
        System.out.print(result);
    }
}