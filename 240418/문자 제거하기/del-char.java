import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length() - 1;

        while (length >= 1) {
            int targetIndex = sc.nextInt();

            if (targetIndex <= length) {
                str = str.substring(0, targetIndex) + str.substring(targetIndex + 1);
            } else {
                str = str.substring(0, length);
            }
            
            length--;
            
            System.out.println(str);
        }
    }
}