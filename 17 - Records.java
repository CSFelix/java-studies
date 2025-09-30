//  *************
//  ** Records **
//  *************
//
//  - when dealing with classes that are read-only, that is, all attributes are private
// and final, we need to write a bunch of stuff to create the class;
//
//  - a better solution for this is using 'records'. They automatically create the
// constructor and the setters, and override the common methods 'toString', 'equals'
// and 'hashCode';
//
//  - besides, we can add custom attributes and methods in records.
//

import java.util.Objects;

class CharacterClass {
  private final String name;
  private final int age;

  CharacterClass(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() { return this.name; }
  public int getAge() { return this.age; }

  @Override
  public String toString() {
    return "Class=" + this.getClass().getSimpleName() + "(name=" + this.name + "; age=" + this.age + ")";
  }

  @Override
  public boolean equals(Object object) {
    if (object == null) return false;
    if (this == object) return true;
    if (this.getClass() != object.getClass()) return false;

    CharacterClass other = (CharacterClass) object;

    return Objects.equals(this.name, other.getName())
      && Objects.equals(this.age, other.getAge());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }
}

record CharacterRecord(String name, int age) {}

class Main {
  public static void main(String... args) {
    CharacterClass goku = new CharacterClass("Goku", 25);
    System.out.println("***---- Class ----***");
    System.out.println("- Object: " + goku);
    System.out.println("- Name: " + goku.getName());
    System.out.println("- Age: " + goku.getAge());

    CharacterRecord chichi = new CharacterRecord("Chichi", 29);
    System.out.println("\n***---- Record ----***");
    System.out.println("- Record: " + chichi);
    System.out.println("- Name: " + chichi.name());
    System.out.println("- Age: " + chichi.age());
  }
}