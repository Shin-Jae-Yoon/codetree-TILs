import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            persons[i] = new Person(name, height, weight);
        }

        StringBuilder sb = new StringBuilder();

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name");

        for (int i = 0; i < n; i++) {
            sb.append(persons[i].name + " ")
                .append(persons[i].height + " ")
                .append(persons[i].weight + " ")
                .append("\n");
        }

        System.out.println(sb.toString());

        sb.setLength(0);

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person a, Person b) {
                return b.height - a.height;
            }
        });

        System.out.println("height");

        for (int i = 0; i < n; i++) {
            sb.append(persons[i].name + " ")
                .append(persons[i].height + " ")
                .append(persons[i].weight + " ")
                .append("\n");
        }

        System.out.println(sb.toString());
    }
}

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}