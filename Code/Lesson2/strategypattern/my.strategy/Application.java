package without.strategy;

//without using Strategy Pattern
public class Application {

	public static void main(String[] args) {
		ProductCollection productCollection = new ProductCollection();

		productCollection.addproduct(new Product("A23", "Iphone 10"));
		productCollection.addproduct(new Product("A28", "Iphone 11"));
		productCollection.bubbleSort();
		productCollection.insertionSort();

		System.out.println(productCollection.removeProduct("A23"));
		System.out.println(productCollection.removeProduct("A28"));
		System.out.println(productCollection.removeProduct("A28"));
	}
}
