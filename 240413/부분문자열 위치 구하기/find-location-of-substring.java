import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();

        int inputLength = input.length();
        int targetLength = target.length();

        for (int i = 0; i < inputLength; i++) {
            if (i + targetLength - 1 >= inputLength) {
                continue;
            }

            boolean isMatched = true;

            for (int j = 0; j < targetLength; j++) {
                if (input.charAt(i + j) != target.charAt(j)) {
                    isMatched = false;
                }
            }

            if (isMatched) {
                System.out.print(i);
                System.exit(0);
            }
        }

        System.out.print(-1);
    }
}