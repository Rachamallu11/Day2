package day2assignment1;

public class Parrot  extends Bird {
	public Parrot(String name) {
		super(name);
	}
	public void fly() {
		System.out.println("Parrot "+super.name+" can fly");

	}
}

