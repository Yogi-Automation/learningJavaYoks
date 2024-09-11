package Fundamentals;

import java.util.Scanner;

public class ReadAndPrint {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number...");
		Scanner scanner = new Scanner(System.in);
		int numberFromUser = scanner.nextInt();
		System.out.println("Entered integer is  : "+ numberFromUser);
		
	}
}
