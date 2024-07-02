import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            students[i] = new Student(name, a , b, c);
        }

        Arrays.sort(students, (a, b) -> (a.a + a.b + a.c) - (b.a + b.b + b.c));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(students[i].name + " ")
                .append(students[i].a + " ")
                .append(students[i].b + " ")
                .append(students[i].c + " ")
                .append("\n");
        }

        System.out.print(sb.toString());
    }
}

class Student {
    String name;
    int a;
    int b;
    int c;

    public Student(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}