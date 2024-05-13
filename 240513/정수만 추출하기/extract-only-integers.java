import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String front = "";
        String back = "";

        for (int i = 0; i < a.length(); i++) {
            if ('0' <= a.charAt(i) && a.charAt(i) <= '9') {
                front += a.charAt(i);
            } else {
                break;
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if ('0' <= b.charAt(i) && b.charAt(i) <= '9') {
                back += b.charAt(i);
            } else {
                break;
            }
        }

        System.out.print(Integer.parseInt(front) + Integer.parseInt(back));
    }
}