// 	***********************
// 	** Anonymous Classes **
// 	***********************
// 
// 	- allows override methods from a class only for a specific object;
//
public class Vehicle {
	private String model;
	private Rank rate;

	Vehicle(String model, Rank rate) {
		this.setModel(model);
		this.setRate(rate);
	}

	public String getModel() { return this.model; }
	public void setModel(String model) { this.model = model; }

	public Rank getRate() { return this.rate; }
	public void setRate(Rank rate) { this.rate = rate; }

	public void horn() {
		System.out.println(this.getModel() + ": Beep-beep (" + this.getRate() + ")");
	}
}

// 	***********
// 	** Enums **
// 	***********
// 
// 	- Enums are used to store specific constant values;
//
enum Rank {
	GREAT,
	GOOD,
	REASONABLE,
	BAD,
	HORRIBLE,
}

// 	***************************
// 	** Functional Interfaces **
// 	***************************
// 
// 	- can contain only one method, but N default and default-static methods;
//
//	- they are largely used as util methods for maps and filters;
// 
@FunctionalInterface
interface ICalculationUtils {
	int apply(int a, int b);

	default void printMessage() {
		System.out.println("Functional Interfaces can contain only one method, but N default and default-static methods!");
	}
}

// 	*************
// 	** Program **
// 	*************
class Program {
	public static void main(String... args) {
		// ***---- Anonymous Classes  and Enums ----***
		Vehicle bugatti = new Vehicle("bugatti", Rank.GREAT);
		bugatti.horn();

		Vehicle ferrari = new Vehicle("ferrari", Rank.GOOD) {
			@Override
			public void horn() {
				System.out.println(this.getModel() + ": Boop-boop (" + this.getRate() + ")");
			}
		};
		ferrari.horn();

		// ***---- Functional Interfaces ----***
		System.out.println("\n---\n");

		ICalculationUtils adder = (x, y) -> x + y;
		System.out.println("- Added: 5 + 7 =" + adder.apply(5, 7));

		ICalculationUtils multiplier = (x, y) -> { return x * y; };
		System.out.println("- Multiplied: 5 x 7 = " + multiplier.apply(5, 7));
		multiplier.printMessage();
	}
}