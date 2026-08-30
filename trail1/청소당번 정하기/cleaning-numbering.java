import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int classCount = 0;
        int pathCount = 0;
        int toiletCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                toiletCount++;
                continue;
            }

            if (i % 3 == 0) {
                pathCount++;
                continue;
            }

            if (i % 2 == 0) {
                classCount++;
            }
        }

        System.out.print(classCount + " " + pathCount + " " + toiletCount);
    }
}