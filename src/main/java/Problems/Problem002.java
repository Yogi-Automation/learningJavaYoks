package Problems;

public class Problem002 {
	
	public final void add() {
		System.out.println("Addition");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		final String a;
		a = "ud";
		String out = "";
		for(int i =0;i<=4;i++) {
			out = out +a;
			System.out.println(out);
		}
		System.out.println("");
		System.out.println("tst");
		System.out.println(String.format("%-" +"10s" , "370" ));
		
		
		System.gc();
		String b= "*";
		String out2 = "";
		for(int i =0;i<=4;i++) {
			for(int j =i;j<=4;j++) {
				out2 = out2 + b;
			}
			System.out.println(out2);
			out2 = "";
		}
		
		System.out.println("");
		String c= "*";
		String space= " ";
		String out3 = "";
		for(int i =0;i<=4;i++) {
			for(int j= i+1;j<=4 ;j++) {
				out3 = out3 + space;
			}
			for(int k = i; k>=0;k--) {
				out3 = out3 + c;
				}
			System.out.println(out3);
			out3 = "";
		}
		System.out.println("");
		out = "";
		char[] alphab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'};
		for(int i =0;i<=4;i++) {
			out = out +alphab[i];
			System.out.println(out);
		}
		System.out.println("");
	
	String palind = "Yokesh";
	char[] nameh = palind.toCharArray();
	String reverser = "";
	
	for(char asd : nameh) {
		reverser = asd + reverser ;
	}
	System.out.println(reverser);
}
}
