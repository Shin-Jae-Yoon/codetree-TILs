import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 개발자 n명
        int n = sc.nextInt();
        // 감염된 개발자가 k번 만큼만 전염병 옮김 (이후부터 전염병은 o 옮기기는 x)
        int k = sc.nextInt();
        // 전염병에 걸려있는 개발자의 번호 p
        int p = sc.nextInt();
        // x개발자와 y개발자가 악수 나눈 정황 t번
        int t = sc.nextInt();
        // 전염된 사람끼리 만나도 전염시킨 것으로 간주 O, 재감염은 X

        boolean[] infected = new boolean[n + 1];
        infected[p] = true;

        int[] shakeNum = new int[n + 1];

        // 악수한 정황 (시간 순으로 오름차순)
        HandShake[] handshake = new HandShake[t];

        for (int i = 0; i < t; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            handshake[i] = new HandShake(time, x, y);
        }

        Arrays.sort(handshake);

        for (int i = 0; i < t; i++) {
            int x = handshake[i].x;
            int y = handshake[i].y;

            if (infected[x]) {
                shakeNum[x]++;
            }

            if (infected[y]) {
                shakeNum[y]++;
            }

            if (shakeNum[x] <= k && infected[x]) {
                infected[y] = true;
            }

            if (shakeNum[y] <= k && infected[y]) {
                infected[x] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (infected[i]) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}

class HandShake implements Comparable<HandShake> {
    // t초
    int t;
    // 개발자 x
    int x;
    // 개발자 y
    int y;

    public HandShake(int t, int x, int y) {
        this.t = t;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(HandShake handshake) {
        return this.t - handshake.t;
    }
}