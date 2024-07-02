import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            students[i] = new Student(w, h, i + 1);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.height != b.height) {
                return b.height - a.height;
            }

            if (a.weight != b.weight) {
                return b.weight - a.weight;
            }

            return a.number - b.number;
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(students[i].height + " ")
                .append(students[i].weight + " ")
                .append(students[i].number + " ")
                .append("\n");
        }

        System.out.print(sb.toString());
    }
}

class Student {
    int height;
    int weight;
    int number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }
}