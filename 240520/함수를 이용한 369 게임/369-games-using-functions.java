import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (isMagicNumber(i) || isThreeMultiple(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    private static boolean isMagicNumber(int n) {
        String number = Integer.toString(n);

        return number.contains("3") || number.contains("6") || number.contains("9");
    }

    private static boolean isThreeMultiple(int n) {
        return n % 3 == 0;
    }
}