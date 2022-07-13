package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Muhammad", Gender.MALE),
                new Person("Musab", Gender.MALE),
                new Person("Laila", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.gender)  //takes all people gender
                .collect(Collectors.toSet())  //remove duplicates
                .forEach(System.out::println); //print out genders

        List<String> names = people.stream()
                .map(person -> person.name)  //takes all people gender
                .collect(Collectors.toList())  //Collect all names so we can store into variable
                ; // we can't use forEach while we want to store elements

        people.stream()
                .map(person -> person.name)  //takes all people gender
                .mapToInt(name -> name.length())  //takes the length of names
                .forEach(System.out::println); //print out genders
    }



 static class Person{
    private final String name;
    private final Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
enum Gender {
    MALE,FEMALE
}
}