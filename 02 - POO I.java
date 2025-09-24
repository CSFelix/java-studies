// 	******************************
// 	** Access Keywords: Classes **
// 	******************************
// 
// - public: accessed in all classes in the project;
// - (default): accessed in all classes in the same package;
// 

// 	*******************
// 	** Final Keyword **
// 	*******************
// 
// - final attributes: cannot be updated after the constructor;
// - final methods: cannot be overwritten;
// - final classes: cannot contain subclasses;
//

class Character {
	// 	*********************************************
	// 	** Access Keywords: Attributes and Methods **
	// 	*********************************************
	// 
	// 	- public: accessed in all classes in the project;
	// 	- (default): accessed in all classes in the same package;
	// 	- protected: accessed in all classes in the same package
	// and by the subclasses;
	// 	- private: accessed only by the class.
	// 

	// 	****************
	// 	** Attributes **
	// 	****************
	private String name;
	private int age;
	private boolean pure;
	private final boolean male; // can only be assigned in the constructor

	public static int count = 0;
	public static final String CLASS_TYPE = "Character Test";

	// 	******************
	// 	** Constructors **
	// 	******************
	Character(String name, int age, boolean pure, boolean male) {
		this.setName(name);
		this.setAge(age);
		this.setPure(pure);
		this.male = male;
		this.count++;
	}

	// 	*************************
	// 	** Getters and Setters **
	// 	*************************
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	public int getAge() { return this.age; }
	public void setAge(int age) { this.age = (age < 0) ? 0 : age; }

	// consider using 'is', 'can', 'has' and 'should' for boolean getters
	public boolean isPure() { return this.pure; }
	public boolean setPure(boolean pure) { return this.pure; }

	public boolean isMale() { return this.male; }


	// 	*************
	// 	** Methods **
	// 	*************
	public void showInfo() {
		System.out.println("- Name: " + this.getName());
		System.out.println("- Age: " + this.getAge());
		System.out.println("- IsPure: " + this.isPure());
		System.out.println("- IsMale: " + this.male);
	}

	public static void showClassType() {
		System.out.println("- CLASS_TYPE: " + Character.CLASS_TYPE);
	}

	public static void showCount() {
		System.out.println("- Count: " + Character.count);
	}
}

public class Program {
	public static void main(String... args) {
		Character goku = new Character("Goku", 25, true, true);
		goku.showInfo();

		Character vegeta = new Character("Vegeta", 25, true, true);

		Character.showClassType();
		Character.showCount();
	}
}