import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int min, max;

        if (len1 >= len2 && len1 >= len3) {
            max = len1;

            if (len2 >= len3) {
                min = len3;
            } else {
                min = len2;
            }
        } else if (len2 >= len1 && len2 >= len3) {
            max = len2;

            if (len1 >= len3) {
                min = len3;
            } else {
                min = len1;
            }
        } else {
            max = len3;

            if (len2 >= len1) {
                min = len1;
            } else {
                min = len2;
            }
        }

        System.out.print(max - min);
    }
}