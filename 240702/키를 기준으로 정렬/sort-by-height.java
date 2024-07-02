import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(persons);

        for (int i = 0; i < n; i++) {
            System.out.println(persons[i].name + " " + persons[i].height + " " + persons[i].weight);
        }
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
        return this.height - person.height;
    }
}