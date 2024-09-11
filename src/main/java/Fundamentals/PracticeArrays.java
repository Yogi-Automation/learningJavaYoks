package Fundamentals;

public class PracticeArrays {
	public static void main(String[] args) {
		
		String aaa[] = {"ugedku"};
		int asd = aaa.length;
		System.out.println(asd + " length of array");
		
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = cars1.length-1; i >= 0; i--) {
		  System.out.println(cars1[i]);
		}
		System.out.println();
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		StringBuilder sb = new StringBuilder();
		for (String i : cars) {
			char[] revert = i.toCharArray();
			String revers = "";
			for(char a : revert) {
				revers =   a + revers;
			}
			System.out.println(revers);
			sb.append(revers+"\t");
		}
		System.out.println(sb.toString());
		
		float ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]);
		
		
	}
	
}
