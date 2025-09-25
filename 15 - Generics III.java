// 	******************
// 	** Generics III **
// 	******************
//
//	- we can also add generic types as methods parameters and return types;
//
//	- the feature of having multiple generic types is available for both: classes
// and methods;
//
//	- the wildcard <?> is used when we are dealing with data structures that
// store generic data types;
//
//	- wildcards <?> can also be bounded by a class and/or by interfaces;
//
//	- wildcards <?> can be used in both: classes and interfaces;
//
import java.util.List;
import java.util.ArrayList;

class Main {
	public static void main(String... args) {
		shout(25, "Chichi");
		shout(25.75, 29);
		shout("Goku", 29.75);

		System.out.println("\n----\n");

		List<Integer> integerList = new ArrayList<>();
		integerList.add(25);
		integerList.add(29);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(25.75);
		doubleList.add(29.75);

		List<String> stringList = new ArrayList<>();
		stringList.add("Goku");
		stringList.add("Chichi");

		printList(integerList);
		printList(doubleList);
		printList(stringList);
	}

	private static <T, V> void shout(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + "!!!!");
		System.out.println(otherThingToShout + "!!!!");
	}

	private static void printList(List<?> listToPrint) {
		System.out.println(listToPrint);
	}
}