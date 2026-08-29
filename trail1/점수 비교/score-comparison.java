import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMathScore = sc.nextInt();
        int aEnglishScore = sc.nextInt();
        int bMathScore = sc.nextInt();
        int bEnglishScore = sc.nextInt();

        if (aMathScore > bMathScore && aEnglishScore > bEnglishScore) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}