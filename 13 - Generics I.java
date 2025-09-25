// 	****************
// 	** Generics I **
// 	****************
//
//	- using only <T> means that our class works with any type;
//
public final class Printer<T> {
	private final T thingToPrint;

	Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public T getThingToPrint() { return this.thingToPrint; }

	public void print() {
		System.out.println("- Thing to Print: " + this.getThingToPrint());
	}
}

class Main {
	public static void main(String... args) {
		Printer<Integer> integerPrinter = new Printer<>(25);
		integerPrinter.print();

		Printer<Double> doublePrinter = new Printer<>(25.75);
		doublePrinter.print();

		Printer<String> stringPrinter = new Printer<>("Hey there!");
		stringPrinter.print();
	}
}