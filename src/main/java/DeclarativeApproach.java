import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarativeApproach {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Muhammad",Gender.MALE),
                new Person("Musab",Gender.MALE),
                new Person("Laila",Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE)

        );
        //Imperative Approach
        List<Person> females = new ArrayList<>();
        for (Person person:people) {
            if(Gender.FEMALE.equals(person.gender))
                females.add(person);
        }
        for (Person female:females) {
            System.out.println(female);
        }
        //Declarative Approach
        //printing the result
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
        //save the result into a list
        List<Person> females1=people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        for (Person female:females) {
            System.out.println(female);
        }
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
