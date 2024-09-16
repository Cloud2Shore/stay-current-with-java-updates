package streams.operations;

import java.util.ArrayList;
import java.util.List;

public class StreamOperationsDemo {
    public static void main(String[] args) {
        final List<Person> peoples = getPeople();
        List<String> names = new ArrayList<>();

        peoples.stream()
                .filter(female -> female.gender().equals(Person.Gender.FEMALE))
                .map(Person::name)
                .map(String::toUpperCase)
                .distinct()
                .forEach(names::add);
        System.out.println(names);
    }

    private static List<Person> getPeople() {
        Person person = new Person("p1", Person.Gender.MALE);
        Person person2 = new Person("p2", Person.Gender.MALE);
        Person person3 = new Person("p3", Person.Gender.FEMALE);
        Person person4 = new Person("p4", Person.Gender.FEMALE);
        Person person5 = new Person("p4", Person.Gender.FEMALE);
        Person person6 = new Person("p5", Person.Gender.OTHER);
        List<Person> peoples = new ArrayList<>();
        peoples.add(person);
        peoples.add(person2);
        peoples.add(person3);
        peoples.add(person4);
        peoples.add(person5);
        peoples.add(person6);
        return peoples;
    }
}
