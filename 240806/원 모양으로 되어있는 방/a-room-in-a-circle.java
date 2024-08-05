import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {
    private static final int MAX_VAL = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] roomList = new int[n + 1];

        int totalPeople = 0;

        for (int room = 1; room <= n; room++) {
            int enterRoomPeople = Integer.parseInt(br.readLine());
            roomList[room] = enterRoomPeople;
        }
        
        int min = MAX_VAL;

        for (int start = 1; start <= n; start++) {
            int sum = 0;

            for (int current = 1; current <= n; current++) {
                int distance = (current + n - start) % n;
                sum += roomList[current] * distance;
            }

            min = Math.min(sum, min);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min);
        System.out.print(sb.toString());
    }
}