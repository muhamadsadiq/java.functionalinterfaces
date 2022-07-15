package streams;

import java.util.List;




public class MoreAboutStreams {

    public static void main(String[] args) {
        List<Person> people = (List<Person>) List.of(
                new Person("Muhammad", Gender.MALE),
                new Person("Musab", Gender.MALE),
                new Person("Laila", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE)
        );
        // if all the persons female then return true otherwise return false  allMatch()
        boolean containsOnlyFemale = people.stream()
                .allMatch(person-> Gender.FEMALE.equals(person.gender));


        // if any person gender is female then return true  anyMatch()
        boolean containsAnyFemale = people.stream()
                .anyMatch(person-> Gender.FEMALE.equals(person.gender));

        // if none of them are female then return true
        boolean containsNoneFemale = people.stream()
                .noneMatch(person -> Gender.FEMALE.equals(person.gender));


        System.out.println(containsOnlyFemale);
        System.out.println(containsAnyFemale);
        System.out.println(containsNoneFemale);
    }






    static class Person{

        private final String name;
        private  final Gender gender;

        Person(String name,Gender gender) {
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
        MALE,FEMALE,PREFER_NOT_TO_SAY
    }
}
