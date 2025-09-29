import java.util.Objects;

//	***********************************
//	** toString, hashCode and equals **
//	***********************************
// 
// 	- toString: way the object will be represented as a String;
//
//	- hashCode: unique hash code of the object accordingly to its attributes
// values. However, there's possibility of the hashes from different objects
// to collide;
//
//	- equals: compares if two objects are equals accordingly to our own logic. 

public final class Character {
  private String name;
  private byte age;

  Character(String name, byte age) {
    this.name = name;
    this.age = age;
  }

  public String getName() { return this.name; }
  public void setName(String name) { this.name = name; }

  public byte getAge() { return this.age; }
  public void setAge(byte age) { this.age = age; }

  @Override
  public String toString() {
    return "Class: " + this.getClass() // .getName() or .getSimpleName()
      + "\n- Name: " + this.getName()
      + "\n- Age: " + this.getAge()
      + "\n---\n";
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.getName(), this.getAge());
  }

  @Override
  public boolean equals(Object object) {
    if (object == null) return false;
    if (this == object) return true;
    if (!(object instanceof Character other)) return false;

    return this.age == other.age && Objects.equals(this.name, other.name);
  }
}

class Main {
  public static void main(String... args) {
    Character goku1 = new Character("Goku", (byte) 25);
    Character goku2 = new Character("Goku", (byte) 25);
    Character chichi = new Character("Chichi", (byte) 29);

    System.out.println("***---- toString() method ----***");
    System.out.println(goku1.toString());
    System.out.println(chichi.toString());

    System.out.println("***---- hashCode() method ----***");
    System.out.println("- Goku1 Hash Code: " + goku1.hashCode());
    System.out.println("- Goku2 Hash Code: " + goku2.hashCode());
    System.out.println("- Chichi Hash Code: " + chichi.hashCode());

    System.out.println("\n***---- equals() method ----***");
    System.out.println("- Goku1 and Goku2: " + goku1.equals(goku2));
    System.out.println("- Goku1 and Chichi: " + goku1.equals(chichi));
  }
}