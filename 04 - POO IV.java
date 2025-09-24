// 	**********************
// 	** Abstract Classes **
// 	**********************
//
//	- all methods should be abstract;
//	- all methods should be implemented by the subclasses, except the getters
// and setters already defined in the super abstract class.
//

// 	****************
// 	** Interfaces **
//	****************
//
//	- all methods are and must be abstract by default;
//	- can only contain final, static attributes;
//	- all methods should be implemented by the subclasses;
//	- a subclass can only inherit a single class, but it can implement
// multiple interfaces.
//

abstract class Character {
	public String name;
  public byte age;

  Character() {
  	System.out.println("A character has been created!");
  }

  public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public byte getAge() { return this.age; }
	public void setAge(byte age) { this.age = age; }

	public abstract String sayHello();
	public abstract String sayGoodBye();
}

public final class Sayan extends Character {
	Sayan(String name, byte age) {
		this.setName(name);
		this.setAge(age);
	}

	public String sayHello() {
		return "Hey there, you can call me " + this.getName() + "!";
	}

	public String sayGoodBye() {
		return "Good bye!";
	}
}

interface ICharacter2 {
	final static int POWER_LEVEL = 9001;

	public String sayMissYou();
	public String showPowerLevel();
}

public final class Earthling extends Character implements ICharacter2 {
	Earthling(String name, byte age) {
		this.setName(name);
		this.setAge(age);
	}

	public String sayHello() {
		return "Hey there, you can call me " + this.getName() + "!";
	}

	public String sayGoodBye() {
		return "Good bye!";
	}

	public String sayMissYou() {
		return "I miss you :(";
	}

	public String sayMissYou(String name) {
		return "I miss you " + name + " :(";
	}

	public String showPowerLevel() {
		return "It's over 9000!! (" + ICharacter2.POWER_LEVEL + ")";
	}
}

class Program {
	public static void main(String... args) {
		Character goku = new Sayan("Goku", (byte) 25);
		Character chichi = new Earthling("Chichi", (byte) 29);

		System.out.println(((Earthling) chichi).sayMissYou(goku.getName()));
		System.out.println("\n---\n");
		System.out.println(((Earthling) chichi).showPowerLevel());
	}
}