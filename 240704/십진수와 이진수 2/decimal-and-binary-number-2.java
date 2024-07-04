import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        // 십진수로 변환
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            num = num * 2 + (n.charAt(i) - '0');
        }

        // 십진수에 17을 곱함
        num *= 17;

        // 이진수로 변환
        int[] digits = new int[20];
        int cnt = 0;

        while (true) {
            if (num < 2) {
                digits[cnt++] = num;
                break;
            }

            digits[cnt++] = num % 2;
            num /= 2;
        }

        // 배열 순서 뒤집어 이진수 형태로 출력
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}