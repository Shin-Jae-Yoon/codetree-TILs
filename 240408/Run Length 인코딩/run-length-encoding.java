import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String encoded = "";
        char currentChar = str.charAt(0);
        int currentNum = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentNum++;
            } else {
                encoded += currentChar;
                encoded += Integer.toString(currentNum);
                
                currentChar = str.charAt(i);
                currentNum = 1;
            }
        }

        encoded += currentChar;
        encoded += Integer.toString(currentNum);

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}