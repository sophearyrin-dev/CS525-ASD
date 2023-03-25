package customers;

import java.util.Iterator;
import java.util.List;


public class AlternateCustomerIterator implements Iterator<Customer> {
    private final List<Customer> customers;
    private int position = 0;

    public AlternateCustomerIterator(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean hasNext() {
        return position < customers.size();
    }

    @Override
    public Customer next() {
        Customer customer = customers.get(position);
        position = position + 2;
        return customer;
    }
}
