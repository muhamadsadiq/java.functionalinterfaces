package combnaitorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidatorService {
    private final Pattern validEmail = Pattern.compile("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");


    private boolean isEmailValid (String email){
        Matcher matcher = validEmail.matcher(email);
        return matcher.matches();
    }

    private boolean isPhoneNumberValid(String PhoneNumber){
        return PhoneNumber.startsWith("+964");
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears()>=18;
    }

    public boolean isCustomerValid(Customer customer){
        return isEmailValid(customer.getEmail())
                && isPhoneNumberValid(customer.getPhoneNumber())
                && isAdult(customer.getDob());
    }
}
