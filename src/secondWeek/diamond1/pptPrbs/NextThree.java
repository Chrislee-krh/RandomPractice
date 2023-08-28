package secondWeek.diamond1.pptPrbs;

//import java.util.Scanner;

public class NextThree {

	public static void main(String[] args) {
		
//		4번 문제
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수를 입력하세요: ");
//		int c = scan.nextInt();
//		
//		int cnt;
//		for (int i = 2; i<=c; i++) {
//			cnt = 0;
//			for (int j = 1; j<=i; j++) {
//				if(i%j == 0) cnt++;
//				
//			}
//			if(cnt==2)	System.out.println(i);	
//		}
//		scan.close();
		
		// 5번 문제
//		for (int i = 1; i<=9; i++) {
//			for (int j = 1; j<=9; j++) {
//				
//				System.out.println(i + "*" + j + "=" + j*i);
//				if(j==9) System.out.println();
//			}
//		}
		for (int i = 1; i<=9; i++) {
			
			for (int j = i*3-2; j<=3; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();  //줄바꿈
			if(i==9) System.out.println();
		}

				
			
			
		
		// 6번 문제
		
//		for (int i = 1; i<=9; i++) {
//			
//			for (int j = 1; j<=3; j++) {
//				System.out.print(j + "*" + i + "=" + j*i + "\t");
//			}
//			System.out.println();  //줄바꿈
//			if(i==9) System.out.println();
//		}
//		
//		for (int i = 1; i<=9; i++) {
//			
//			for (int j = 4; j<=6; j++) {
//				System.out.print(j + "*" + i + "=" + j*i + "\t");
//			}
//			System.out.println();
//			if(i==9) System.out.println();
//		}	
//		
//		for (int i = 1; i<=9; i++) {
//			
//			for (int j = 7; j<=9; j++) {
//				System.out.print(j + "*" + i + "=" + j*i + "\t");
//			}
//			System.out.println();
//			if(i==9) System.out.println();
//		}
	}

}
