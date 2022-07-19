package combnaitorPattern;

import java.time.LocalDate;
import static combnaitorPattern.CustomerRegistrationValidator.*;
public class Main {
    public static void main(String[] args) {

        //creating new customer for testing
        Customer customer = new Customer(
                "muhammad"
                ,"muhammad@gmail.com"
                ,"+9647507654296"
                , LocalDate.of(2001,9,17)
        );

        //print out the result if whatever the customer info was valid or not
        System.out.println(new CustomerValidatorService().isCustomerValid(customer));

        //Using combinator pattern


        ValidationResult result = isEmailValid()
                                        .and(isPhoneNumberValid())
                                        .and(isAnAdult())
                                        .apply(customer);

        System.out.println(result);
    }
}
