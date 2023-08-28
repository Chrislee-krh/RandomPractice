package secondWeek.diamond1;

public class Star1 {

	public static void main(String[] args) {
		int row = 5;
		
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j<i+1; j++)	{
//				System.out.print("*"); // 1
//				
//			}
//			System.out.println(" ");
//		}
//		
		
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < row -i; j++) {
//				System.out.print("*");// 12345
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < row; i++) {
//			for(int j = 0; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j<row-i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j<row - i -1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j< i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
