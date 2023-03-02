package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class FilterIterator implements Iterator<Customer> {
    private final List<Customer> customers;
    private int position = 0;
    private Predicate<Customer> predicate;

    public FilterIterator(List<Customer> customers, Predicate<Customer> predicate) {
        this.customers = customers;
        this.predicate = predicate;
    }


    @Override
    public boolean hasNext() {
        int tempPosition = position;
        while (tempPosition < customers.size()) {
            Customer nextCustomer = customers.get(tempPosition);
            if (predicate.test(nextCustomer)) {
                return true;
            } else {
                tempPosition++;
            }
        }
        return false;
    }

    @Override
    public Customer next() {
        int tempPosition = position;
        while (tempPosition < customers.size()) {
            Customer nextCustomer = customers.get(tempPosition);
            if (predicate.test(nextCustomer)) {
                position = tempPosition + 1;
                return nextCustomer;
            } else {
                tempPosition++;
            }
        }
        return null;
    }
}
