package secondWeek.diamond1;

public class Diamond {

	public static void main(String[] args) {

		int row = 9;
		int stndLine = row/2;
		int star = 1;
		boolean flag = true;
		
		for (int i = 0; i <= stndLine; i++) {
			for (int j = 0; j <= stndLine - i; j++) { //01234
				System.out.print(" ");
			}
			for (int j = 0; j <= (star*2) -i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
				

	}

}
