package with.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ApplicationExternalIterator {

	public static void main(String[] args) {
		List<String> alphabet = new ArrayList<String>();
		alphabet.add("a");
		alphabet.add("b");
		alphabet.add("c");

		Iterator<String> iterator = alphabet.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toUpperCase());
		}
	}
}
