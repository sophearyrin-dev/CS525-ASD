import java.util.ArrayList;
import java.util.Collection;

public class Category extends ProductCategory{

    protected Collection<ProductCategory> productCategories = new ArrayList<ProductCategory>();

    public Category(String name) {
        super(name);
    }

    public void addCategory(ProductCategory productCategory){
        productCategories.add(productCategory);
    }

    @Override
    public void output() {
        System.out.println("--- Category --- " + "name : " + name);
        for(ProductCategory c: productCategories){
            c.output();
        }
    }
}
