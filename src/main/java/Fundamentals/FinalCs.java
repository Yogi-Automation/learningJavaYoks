package Fundamentals;

class Parent {
	public final void printMessage() {
		System.out.println("This is a final method in the Parent class.");
	}
}

public class FinalCs extends Parent {
//	public   void printMessage() {
//		System.out.println("This is a final method in the Parent c");
//	}
	
	public static void main(String[] args) {

		FinalCs child = new FinalCs();
		child.printMessage();
	}
}