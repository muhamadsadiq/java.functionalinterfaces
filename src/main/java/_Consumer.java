import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
            Customer customer = new Customer("muhammed",9172896);
            greetCustomer(customer);

            greetCustomerConsumer.accept(customer);
    }




    //normal java function
    public static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName
                +", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }
    //Consumer functional interface
    static Consumer<Customer> greetCustomerConsumer = customer
            -> System.out.println("Hello "+customer.customerName
            +", thanks for registering phone number "
            + customer.customerPhoneNumber);

    static class Customer{
        final String customerName;
        final int customerPhoneNumber;


        Customer(String customerName, int customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
