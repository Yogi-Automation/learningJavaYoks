package Problems;

class PolymorphismExample1 {

	public void print() {
		System.out.println("Class A's method is running");
	}
};

public class PolymorphismExample extends PolymorphismExample1 {
	public void print() {
		System.out.println("Class B's method is running");
	}

	public static void main(String[] args) {

		PolymorphismExample b1 = new PolymorphismExample();

		// Method overriding (Run-time polymorphism)
		b1.print();
	}
}