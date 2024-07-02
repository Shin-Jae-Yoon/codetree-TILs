import java.util.Scanner;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            persons[i] = new Person(name, height, weight);
        }

        Arrays.sort(persons);

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(persons[i].name).append(" ")
                .append(persons[i].height).append(" ")
                .append(persons[i].weight).append("\n");
        }

        System.out.print(sb.toString());
    }
}

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        if (this.height != person.height) {
            return this.height - person.height;
        }

        return person.weight - this.weight;
    }
}