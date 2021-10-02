package tamrin62;

public class Bank {


    private Customer[] customers;
    private int customerIndex;


    public int getCustomerIndex() {
        return customerIndex;
    }


    public Customer[] getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers[customerIndex] = customer;
        customerIndex++;
    }


    public Bank() {
        customers = new Customer[1000];
        customerIndex = 0;
    }

}
