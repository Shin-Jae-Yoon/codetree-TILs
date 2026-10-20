import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N개의 원소 , Q개의 질의
        // 질의는 세종류
        // 1 a (a번째 원소 출력)
        // 2 b (b인 원소 찾아서, 몇번째인지 출력, 여러개면 index 제일 작은거, 없으면 0)
        // 3 s e (s부터 e까지 출력)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= Q; i++) {
            int query = sc.nextInt();

            if (query == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a]);
            }

            if (query == 2) {
                int b = sc.nextInt();
                int targetIndex = 0;

                for (int j = 1; j <= N; j++) {
                    if (arr[j] == b) {
                        targetIndex = j;
                        break;
                    }
                }

                System.out.println(targetIndex);
            }

            if (query == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int j = s; j <= e; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.println();
            }
        }
    }
}