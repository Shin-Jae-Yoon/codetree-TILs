import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] input = sc.next().toCharArray();
        int queryCount = sc.nextInt();

        for (int i = 0; i < queryCount; i++) {
            int queryType = sc.nextInt();
            
            if (queryType == 1) {
                int targetIndex = sc.nextInt();
                int changeIndex = sc.nextInt();
                char temp;

                temp = input[targetIndex - 1];
                input[targetIndex - 1] = input[changeIndex - 1];
                input[changeIndex - 1] = temp;
            }

            if (queryType == 2) {
                char targetChar = sc.next().charAt(0);
                char changeChar = sc.next().charAt(0);

                for (int j = 0; j < input.length; j++) {
                    if (input[j] == targetChar) {
                        input[j] = changeChar;
                    }
                }
            }

            System.out.println(String.valueOf(input));
        }
    }
}