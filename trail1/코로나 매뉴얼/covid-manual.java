import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char aStatus = sc.next().charAt(0);
        int aTemp = sc.nextInt();
        char bStatus = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        char cStatus = sc.next().charAt(0);
        int cTemp = sc.nextInt();

        int statusCount = 0;

        if (aStatus == 'Y' && aTemp >= 37) {
            statusCount++;
        }

        if (bStatus == 'Y' && bTemp >= 37) {
            statusCount++;
        }

        if (cStatus == 'Y' && cTemp >= 37) {
            statusCount++;
        }

        if (statusCount >= 2) {
            System.out.println("E");            
        } else {
            System.out.println("N");
        }
    }
}