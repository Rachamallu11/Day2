package day2assignment1;

public class Eagle  extends Parrot {
	public Eagle(String name) {
		super(name);
	}
	public void fly() {
		System.out.println("Eagle "+super.name+" can fly");

	}

}
