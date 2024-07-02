import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sequence[] sequences = new Sequence[n];

        for (int i = 0; i < n; i++) {
            sequences[i] = new Sequence(sc.nextInt(), i + 1);
        }

        Arrays.sort(sequences);

        int[] changeRank = new int[n + 1];

        for (int i = 0; i < n; i++) {
            changeRank[sequences[i].index] = i + 1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(changeRank[i]).append(" ");
        }

        System.out.print(sb.toString());
    }
}

class Sequence implements Comparable<Sequence> {
    int number;
    int index;

    public Sequence(int number, int index) {
        this.number = number;
        this.index = index;
    }

    @Override
    public int compareTo(Sequence sequence) {
        if (this.number != sequence.number) {
            return this.number - sequence.number;
        }
        
        return this.index - sequence.index;
    }
}