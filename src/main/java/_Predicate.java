import java.util.function.Predicate;

public class _Predicate {


    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07517873821"));
        System.out.println(isPhoneNumberValid("0751787382")+"\n");

        System.out.println(isPhoneNumberValidFunctional.test("07517873821"));
        System.out.println(isPhoneNumberValidFunctional.test("0751787382")+"\n");

        //you can also use or
        System.out.println(isPhoneNumberValidFunctional.and(isPhoneNumberContains3).test("07517873821"));
        System.out.println(isPhoneNumberValidFunctional.and(isPhoneNumberContains3).test("07517872821"));
    }
    //Functional Style
    static Predicate<String> isPhoneNumberValidFunctional = phoneNumber
            -> phoneNumber.startsWith("07")&&phoneNumber.length()==11;

    static Predicate<String> isPhoneNumberContains3 = phoneNumber
            -> phoneNumber.contains("3");
    // normal function
    static boolean isPhoneNumberValid(String PhoneNumber){
        return PhoneNumber.startsWith("07")&&PhoneNumber.length()==11;
    }
}
