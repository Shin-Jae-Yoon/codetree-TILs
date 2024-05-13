import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        String result1 = "";
        String result2 = "";

        for (int i = 0; i < first.length(); i++) {
            if ('0' <= first.charAt(i) && first.charAt(i) <= '9') {
                result1 += first.charAt(i);
            }
        }

        for (int i = 0; i < second.length(); i++) {
            if ('0' <= second.charAt(i) && second.charAt(i) <= '9') {
                result2 += second.charAt(i);
            }
        }

        System.out.print(Integer.parseInt(result1) + Integer.parseInt(result2));
    }
}