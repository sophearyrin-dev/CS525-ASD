package without.strategy.mystrategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ProductCollection {
    Collection<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public boolean removeProduct(String number){

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getNumber().contentEquals(number)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
