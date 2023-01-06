package Record.Example3;

public class RecordsExample03 {

    public static void main(String[] args) {
        var customer = new Customer(50567L,null,null);
        System.out.println(customer.name());

        var copy = new Customer(customer.id(), customer.name(), customer.email());
        System.out.println(copy.equals(customer));

        System.out.println(customer);
        System.out.println(copy);
    }
}
