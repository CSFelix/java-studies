//Cast, Upcast, Downcast, 
//	************************
//	** Promotions - Casts **
//	************************
//
//	- cast: a primitive data type is converted to another one.
// E.g.: (byte) 25;
//
//	- upcast: a subclass instance is converted to a superclass instance.
// E.g.: Character goku = new Sayan("Goku", (byte) 25);
//
//	- downcast: a superclass instance is converted to a subclass instance.
// E.g.: ((Sayan) goku).greet(); 
//
public class Character {
	private String name;
	private byte age;

	Character(String name, byte age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public byte getAge() { return this.age; }
	public void setAge(byte age) { this.age = age; }
}

public final class Sayan extends Character {
	Sayan(String name, byte age) {
		super(name, age);
	}

	public void greet() {
		System.out.println("Hey there, I am " + this.getName() + ", I am " + this.getAge() + " years-old. Oh, and I am a Sayan!");
	}
}

public final class Human extends Character {
	Human(String name, byte age) {
		super(name, age);
	}

	public void greet() {
		System.out.println("Hey there, I am " + this.getName() + ", I am " + this.getAge() + " years-old. Oh, and I am a Human!");
	}
}

class Program {
	public static void main(String... args) {
		Character goku = new Sayan( // upcast
			"Goku"
			, (byte) 25 // cast
		);

		Character chichi = new Human("Chichi", (byte) 29);

		((Sayan) goku).greet(); // downcast
		((Human) chichi).greet();
	}
}