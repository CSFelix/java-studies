import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Cat {
	private final String name;
	private int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() { return this.name; }

	public void setAge(int age) { this.age = age; }
	public int getAge() { return this.age; }

	public void publicMeow() {
		System.out.println("Public Meow!");
	}

	private void privateMeow() {
		System.out.println("Private Meow!");
	}

	public static void publicStaticMeow() {
		System.out.println("Public Static Meow!");
	}

	private static void privateStaticMeow() {
		System.out.println("Private Static Meow!");
	}
}

class Main {
	public static void main(String... args) throws Exception {
		Cat myCat = new Cat("Chichi", 29);

		// ***---- Class Name ----***
		Class<?> myCatClass = myCat.getClass();
		String myCatClassName = myCatClass.getName();
		String myCatSimpleName = myCatClass.getSimpleName();

		System.out.println("***---- Class ----***");
		System.out.println("- My Cat Class: " + myCatClass);
		System.out.println("- My Cat Class Name: " + myCatClassName);
		System.out.println("- My Cat Class Simple Name: " + myCatSimpleName);

		// ***---- Fields ----***
		Field[] myCatFields = myCatClass.getDeclaredFields();

		System.out.println("\n***---- Fields ----***");
		System.out.println("- My Cat Fields: " + myCatFields);
		System.out.println("---");

		for (Field field : myCatFields) {
			System.out.println("- Field Full Signature: " + field);
			System.out.println("- Field Name: " + field.getName());
			System.out.println("---");

			// updating private attribute
			if (field.getName().equals("name")) {
				field.setAccessible(true); // turns a private field "public"
				field.set(myCat, "Chichi 2"); // sets value to an object's field
			}
		}

		System.out.println("- Updated Private Name Attribute: " + myCat.getName());

		// ***---- Methods ----***
		Method[] myCatMethods = myCatClass.getDeclaredMethods();

		System.out.println("\n***---- Methods ----***");
		System.out.println("- My Cat Methods: " + myCatMethods);
		System.out.println("---");

		for (Method method : myCatMethods) {
			System.out.println("- Method Full Signature: " + method);
			System.out.println("- Method Name: " + method.getName());

			if (method.getName().equals("privateMeow")) {
				method.setAccessible(true);
				method.invoke(myCat);
			}

			if (method.getName().equals("privateStaticMeow")) {
				method.setAccessible(true);
				method.invoke(null); // we set 'null' when the method is static
			}

			System.out.println("---");
		}
	}
}