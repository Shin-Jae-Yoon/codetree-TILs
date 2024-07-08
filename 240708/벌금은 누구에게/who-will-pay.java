import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 학생 N명
        int n = sc.nextInt();
        // 벌칙 걸린 학생 횟수
        int m = sc.nextInt();
        // 벌칙 횟수 (k번 이상 벌칙에 걸린 학생이 벌금)
        int k = sc.nextInt();

        // 벌칠 걸린 횟수 저장
        int[] students = new int[n + 1];
        // 벌칙 걸린 놈들
        int[] selected = new int[m + 1];

        for (int i = 1; i <= m; i++) {
            selected[i] = sc.nextInt();
        }

        int result = -1;

        for (int i = 1; i <= m; i++) {
            int penaltyNum = selected[i];
            students[penaltyNum]++;

            if (students[penaltyNum] == k) {
                result = penaltyNum;
                break;
            }
        }

        System.out.print(result);
    }
}