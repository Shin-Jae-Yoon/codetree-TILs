import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        // 원소 입력
        int[] nArr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nArr[i] = sc.nextInt();
        }

        // 질의 입력 + 처리후 출력
        // 1 a, 2 a, 3 a b 3가지 경우
        for (int i = 1; i <= q; i++) {
            int qType = sc.nextInt();

            if (qType == 1) {
                int a = sc.nextInt();
                
                System.out.print(nArr[a]);
            }

            else if (qType == 2) {
                int a = sc.nextInt();
                int idx = 0;

                for (int j = 1; j <= n; j++) {
                    if (nArr[j] == a) {
                        idx = j;
                        break;
                    }
                }

                System.out.print(idx);
            }

            else {
                int a = sc.nextInt();
                int b = sc.nextInt();

                for (int j = a; j <= b; j++) {
                    System.out.print(nArr[j] + " ");
                }
            }

            System.out.println();
        }
    }
}