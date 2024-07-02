import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Plane[] planes = new Plane[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            planes[i] = new Plane(x, y, i + 1);
        }

        Arrays.sort(planes);

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(planes[i].number).append("\n");
        }

        System.out.print(sb.toString());
    }
}

class Plane implements Comparable<Plane> {
    int x;
    int y;
    int number;
    int distance;

    public Plane(int x, int y, int number) {
        this.x = x;
        this.y = y;
        this.number = number;
        this.distance = Math.abs(this.x) + Math.abs(this.y);
    }

    @Override
    public int compareTo(Plane plane) {
        if (this.distance != plane.distance) {
            return this.distance - plane.distance;
        }

        return this.number - plane.number;
    }
}