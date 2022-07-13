package optionals;

import java.util.Locale;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Object value = Optional.ofNullable(null) //if the value is not null variable will take first value otherwise it takes second value
                .orElseGet(() -> "Default value");

        System.out.println(value+"\n");

/*
        Object value1 = Optional.ofNullable(null)    if the value is null it throws an Exception
        .orElseThrow(IllegalAccessException::new);
        System.out.println(value+"\n");
*/

        Optional.ofNullable("muhammad@gmail.com"+"\n")  // if the value isPresent(not null) it will print the value inside the isPresent();
                .ifPresent(email ->{
            //same logic
            System.out.println("Sending email to "+email);
        } );

        Optional.ofNullable(null)                  // if the value is null then it will take the second value
                .ifPresentOrElse(email -> System.out.println("Sending email to "+email)
                ,()-> System.out.println("Cannot send email"+"\n"));

//         before
//         Person person = new Person("muhammad",null);
//        System.out.println(person.getEmail().toLowerCase());  //it will throw Exception

            //after
        Person person = new Person("muhammad",null);
        System.out.println(person.getEmail()
                        .map(String::toLowerCase)
                        .orElse("email not provided"));

            //another way

        if(person.getEmail().isPresent()){
            System.out.println(person.getEmail());
        }
        else
            System.out.println("email not provided");

    }

    static class Person {
        private final String name;
        private final String email;

        Person(String name, String email) {
            this.name = name;
            this.email = email;
        }


        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }

        public String getName() {
            return name;
        }
    }
}
