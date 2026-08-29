import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = 0;
        
        if (a <= b && a <= c) {
            min = a;
        } 
        
        if (b <= a && b <= c) {
            min = b;
        }

        if (c <= a && c <= b) {
            min = c;
        }

        System.out.print(a == min ? "1 " : "0 ");
        System.out.print(a == b && b == c ? "1" : "0");
    }
}