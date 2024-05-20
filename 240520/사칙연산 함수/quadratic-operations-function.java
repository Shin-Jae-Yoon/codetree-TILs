import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int c = sc.nextInt();

        switch (operator) {
            case '+':
                plus(a, c);
                break;
            case '-':
                minus(a, c);
                break;
            case '/':
                divide(a, c);
                break;
            case '*':
                multiple(a, c);
                break;
            default:
                System.out.println("False");
                break;
        }
    }

    private static void plus(int a, int c) {
        System.out.println(a + " + " + c + " = " + (a + c));
    }

    private static void minus(int a, int c) {
        System.out.println(a + " - " + c + " = " + (a - c));
    }

    private static void divide(int a, int c) {
        System.out.println(a + " / " + c + " = " + (a / c));
    }

    private static void multiple(int a, int c) {
        System.out.println(a + " * " + c + " = " + (a * c));
    }
}