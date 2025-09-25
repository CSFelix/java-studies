// 	*****************
// 	** Generics II **
// 	*****************
//
//	- when 'T' extends a class and/or multiple interfaces, we call it a Generic
// Bounded Type, which means that our generic type can be everything that extends
// the bound class and/or implements the bound interfaces;
//
//
public abstract class Animal {
	protected String name;

	protected String getName() { return this.name; }

	public abstract String eat();
}

public final class Cat extends Animal {
	Cat(String name) {
		this.name = name;
	}

	public String eat() {
		return "The cat " + this.getName() + " is eating.";
	}
}

public final class Dog extends Animal {
	Dog(String name) {
		this.name = name;
	}

	public String eat() {
		return "The dog " + this.getName() + " is eating.";
	}
}

public final class AnimalPrinter<T extends Animal> {
	private final T animalToPrint;

	AnimalPrinter(T animalToPrint) {
		this.animalToPrint = animalToPrint;
	}

	public T getAnimalToPrint() { return this.animalToPrint; }

	public void print() {
		System.out.println(this.getAnimalToPrint().eat());
	}
}

class Main {
	public static void main(String... args) {
		AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat("Cat 1"));
		catPrinter.print();

		AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(new Dog("Dog 1"));
		dogPrinter.print();
	}
}