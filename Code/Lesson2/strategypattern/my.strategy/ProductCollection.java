package without.strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection {

	private List<Product> products = new ArrayList<Product>();
	
	public void addproduct(Product product) {
		products.add(product);
	}
	
	public boolean removeProduct(String productNumber) {

		//using iterator
		//The iterator is commonly used to loop through the objects of a collection,
		// read them, and remove them.
		Iterator<Product> iterator = products.iterator(); //convert from collection to iterator
		while (iterator.hasNext()) {
			if (iterator.next().getProductNumber().contentEquals(productNumber)) {
				iterator.remove();
				return true;
			}
		}
		return false;

		//if use for loop
//		for(int i=0; i<products.size(); i++){
//			if(productNumber.equalsIgnoreCase(products.get(i).getProductNumber())){
//				products.remove(productNumber);
//				return true;
//			}
//		}
//
//		return false;
	}
	
	public void bubbleSort() {
		System.out.println("peform bubblesort");
	}
	
	public void insertionSort() {
		System.out.println("peform insertionsort");
	}

	public void quickSort() {
		System.out.println("peform quicksort");
	}
}
