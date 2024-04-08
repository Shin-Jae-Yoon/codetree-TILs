import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        int lenAll = 0;
        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            lenAll += str[i].length();

            if (str[i].charAt(0) == 'a') {
                cnt++;
            }
        }

        System.out.print(lenAll + " " + cnt);
    }
}