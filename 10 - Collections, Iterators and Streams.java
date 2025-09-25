import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Main {
	public static void main(String... args) {
		//	***************
		//	** Iterators **
		//	***************
		//
		//	- great to iterate data structures;
		//
		List<String> characters = new ArrayList<>();
		characters.add("Goku");
		characters.add("Vegeta");
		characters.add("Broly");
		characters.add("Gohan");

		Iterator<String> iterator = characters.iterator();

		System.out.println("***---- Iterator ----***");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		//	*****************
		//	** Collections **
		//	*****************
		//
		//	- contains a bunch of useful functions to manipulate data structures;
		//
		System.out.println("\n***---- Collections ----***");
		Collections.sort(characters);
		System.out.println(characters);

		//	************
		//	** Stream **
		//	************
		//
		//	- great for quick manipulations, such as filter, map, reduce, forEach...
		//
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);

		List<Integer> doubleEvenNumbers = numbers.stream()
			.filter(number -> number % 2 == 1)
			.map(number -> number * 2)
			.toList();

		System.out.println("\n***---- Stream ----***");
		System.out.println("- Double Even Numbers: " + doubleEvenNumbers);
	}
}