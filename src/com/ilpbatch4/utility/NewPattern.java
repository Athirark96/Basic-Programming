public class NewPattern {

	public static void main(String[] args) {
		int input=4;
		newPattern(input); 

	}
	private static void newPattern(int input) {
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
