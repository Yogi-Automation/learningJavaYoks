package Problems;

//1.Write a Program to Find Sum of Fibonacci Series Number
// 0,1,1,2,3,5,8,13,21,34
//	0 + 1 + 3 + 8 + 21 = 33

public class Problem001 {
	
	// To find a fibonnacci number
	int fibonacciSeries(int inputNum) {
		int valueOne = 0;
		int valueTwo = 1;
		int temp = 0;
		for(int i = 2;i<=inputNum;i++) {
			temp = valueOne + valueTwo;
			valueOne = valueTwo;
			valueTwo = temp;
		}
		System.out.println(temp);
		return temp;
	}
	
	public static void main(String[] args) {
		Problem001 fibbonacci = new Problem001();
		int fibionciValue = fibbonacci.fibonacciSeries(8);
		
	}
	
}
