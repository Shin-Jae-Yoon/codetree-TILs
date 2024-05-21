import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (isPalindrome(input)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean isPalindrome(String str) {
        int len = str.length();
        char[] tempArr = new char[len];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = str.charAt(len - 1 - i);
        }

        String temp = String.valueOf(tempArr);

        if (str.equals(temp)) {
            return true;
        }

        return false;
    }
}