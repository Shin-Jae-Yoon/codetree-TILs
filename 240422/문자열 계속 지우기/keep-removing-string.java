import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();

        int aLen = strA.length();
        int bLen = strB.length();

        while (true) {
            int index = strA.indexOf(strB);
            
            if (index != -1) {
                strA = strA.substring(0, index) + strA.substring(index + bLen, aLen);
                aLen = aLen - bLen;
            }

            if (index == -1) {
                break;
            }
        }

        System.out.print(strA);
    }
}