import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int number = sc.nextInt();

            if (number == 1) {
                str = str.substring(1, len) + str.substring(0, 1);
            }

            if (number == 2) {
                str = str.substring(len - 1, len) + str.substring(0, len - 1);
            }

            if (number == 3) {
                String temp = "";

                for (int j = len - 1; j >= 0; j--) {
                    temp += str.charAt(j);
                }

                str = temp;
            }

            System.out.println(str);
        }
    }
}