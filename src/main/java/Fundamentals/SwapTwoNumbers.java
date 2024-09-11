package Fundamentals;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		// without a new variable
		int firstNum = 10 ;
		int secondNum = 20;
		
		firstNum = firstNum + secondNum ;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum ;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
	}
}
