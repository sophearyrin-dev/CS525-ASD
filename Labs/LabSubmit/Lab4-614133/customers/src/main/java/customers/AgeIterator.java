package customers;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class AgeIterator implements Iterator<Customer> {
    private final List<Customer> customers;
    private int position = 0;

    public AgeIterator(List<Customer> customers) {
        this.customers = customers;
        this.customers.sort(Comparator.comparing(Customer::getAge));
    }

    @Override
    public boolean hasNext() {
        return position < customers.size();
    }

    @Override
    public Customer next() {
        return customers.get(position++);
    }
}
