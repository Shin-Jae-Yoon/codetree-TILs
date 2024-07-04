import java.util.Scanner;

public class Main {
    private static final int MAX_ARR = 20;
    private static int[] result = new int[MAX_ARR];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();

        int tenDigit = toTenDigit(a, n);
        
        fromTenDigit(b, tenDigit);

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
    }

    private static int toTenDigit(int formation, String number) {
        int tenDigit = 0;

        for (int i = 0; i < number.length(); i++) {
            tenDigit = tenDigit * formation + (number.charAt(i) - '0');
        }

        return tenDigit;
    }

    private static void fromTenDigit(int formation, int number) {
        while (true) {
            if (number < formation) {
                result[count++] = number;
                break;
            }

            result[count++] = number % formation;
            number /= formation;
        }
    }
}