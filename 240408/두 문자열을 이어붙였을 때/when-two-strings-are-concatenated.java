import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String a = str1 + str2;
        String b = str2 + str1;

        if (a.equals(b)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}