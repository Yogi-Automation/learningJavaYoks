package Problems;

public class Problem004 {

	public static void main(String[] args) {
		String myText = "Yokesh";
		
		for (int i = 1; i <= myText.length(); i++) {
            // Print leading spaces to align the word to the right
            for (int j = myText.length(); j > i; j--) {
                System.out.print(" ");
            }
            // Print the substring from the start of the word up to the current character
            System.out.println(myText.substring(0, i));
        }
    }
}