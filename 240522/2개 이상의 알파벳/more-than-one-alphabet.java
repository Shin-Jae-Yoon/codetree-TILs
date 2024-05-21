import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (isDifferentAlphabet(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isDifferentAlphabet(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) != s.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}