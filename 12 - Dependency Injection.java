// 	*******************************
// 	** Dependency Injection (DI) **
// 	*******************************
//
//	- when a class contains attributes of another class type, it is a good
// practice to set the attribute as final and set the object to the attribute
// in the constructor;
//
public final class Author {
	private String name;

	Author(String name) {
		this.name = name;
	}

	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
}

public final class Anime {
	private final Author author;

	Anime(Author author) {
		this.author = author;
	}

	public Author getAuthor() { return this.author; }

	@Override
	public String toString() {
		return "- Class: " + this.getClass().getSimpleName()
			+ "\n- Author: " + this.getAuthor().getName();
	}
}

class Main {
	public static void main(String... args) {
		Anime dragonBall = new Anime(new Author("Akira Toriyama"));
		System.out.println(dragonBall.toString());
	}
}