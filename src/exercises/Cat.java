package exercises;

public class Cat {

	private String name;
	private int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("My name is " + name);
	}

	void kill() {
		lives--;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo! Muhahahaha !");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {

		Cat c1 = new Cat("Felix");
		c1.meow();

		c1.printName();

		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
		c1.kill();
	}
}
