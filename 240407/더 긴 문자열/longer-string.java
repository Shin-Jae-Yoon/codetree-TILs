import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length == str2Length) {
            System.out.print("same");
        } else if (str1Length > str2Length) {
            System.out.print(str1 + " " + str1Length);
        } else {
            System.out.print(str2 + " " + str2Length);
        }
    }
}