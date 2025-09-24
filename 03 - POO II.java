// 	*******************
// 	** Encapsulation **
// 	*******************
//
//	- all attributes are private and can only be accessed and modified
// by the getters and setters;
//	- only boolean getters follow a different naming rule, using the words:
// 'is', 'can', 'should' and 'has' in the beginning.
//

// 	*****************
// 	** Inheritance **
// 	*****************
//
//	- private attributes and private methods are not inherited;
//	- the constructor of the superclass is automatically called
// when instantiating the subclasses;
//	- the superclass can be accessed by the subclasses through 'super'
// keyword.
//

// 	******************
// 	** Polymorphism **
// 	******************
//
// - variable of superclass can be assigned with an object from a subclass;
// - override: rewrite a method from a superclass in the subclass. Final and
// Static Methods cannot be overriden, they must contain the same data type
// for the return and the arguments and must contain the same or a superior
// access level (public -> protected -> default -> private);
// - overload: rewrite a method using different return type, argument types
// and argument count.
//
public class Character {
	private String name;
	private short age = 0;

	Character(String name, short age) {
		this.setName(name);
		this.setAge(age);
		System.out.println("- A Character has been created!");
	}

	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public short getAge() { return this.age; }
	public void setAge(short age) { this.age = age; }

	public String sayHello() {
		return "Hey there, you can call me " + this.getName() + "!";
	}

	public String sayGoodBye() {
		return "Good bye!";
	}

	public String sayGoodBye(String name) {
		return "See you " + name + "!";
	}
}

public final class Sayan extends Character {
	Sayan(String name, short age) {
		super(name, age);
		System.out.println("- A Sayan has been created: " + name + "!");
	}
}

public final class Earthling extends Character {
	Earthling(String name, short age) {
		super(name, age);
		System.out.println("- An Earthling has been created " + name + "!");
	}

	public String sayHello() {
		return "Hey there, I am " + this.getName() + " and I am " + this.getAge() + " years old";
	}
}

class Program {
	public static void main(String... args) {
		Character goku = new Sayan("Goku", (short) 25);
		Character chichi = new Earthling("Chichi", (short) 29);

		System.out.println("\n---\n");

		System.out.println(goku.sayHello());
		System.out.println(chichi.sayHello());			

		System.out.println("\n---\n");

		System.out.println(goku.sayGoodBye(chichi.getName()));
		System.out.println(chichi.sayGoodBye());
	}
}