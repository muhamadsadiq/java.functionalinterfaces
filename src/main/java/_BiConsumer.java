import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {

    public static void main(String[] args) {
        _Consumer.Customer customer = new _Consumer.Customer("muhammed",9172896);
        greetCustomer(customer,true);

        greetCustomerConsumer.accept(customer,false);
    }




    //normal java function
    public static void greetCustomer(_Consumer.Customer customer , boolean showPhoneNumber){
        System.out.println("Hello "+customer.customerName
                +", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "*******")) ;
    }
    //BiConsumer functional interface
    static BiConsumer<_Consumer.Customer,Boolean> greetCustomerConsumer = (customer,showPhoneNumber)
            ->  System.out.println("Hello "+customer.customerName
            +", thanks for registering phone number "
            + (showPhoneNumber ? customer.customerPhoneNumber : "*******")) ;


}
