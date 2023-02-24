package without.strategy.mystrategy;

public class Application {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.addProduct(new Product("123","Coca"));
        productCollection.addProduct(new Product("124","Bread"));

        SortStrategy bubbleSort = new BubbleSort();
        bubbleSort.sort();
    }
}
