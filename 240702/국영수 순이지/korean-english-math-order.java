import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            students[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(students, (a, b) -> {
            if (a.korean != b.korean) {
                return b.korean - a.korean;
            } else {
                if (a.english != b.english) {
                    return b.english - a.english;
                } else {
                    return b.math - a.math;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(students[i].name + " ");
            System.out.print(students[i].korean + " ");
            System.out.print(students[i].english + " ");
            System.out.println(students[i].math + " ");
        }
    }
}

class Student {
    String name;
    int korean;
    int english;
    int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}