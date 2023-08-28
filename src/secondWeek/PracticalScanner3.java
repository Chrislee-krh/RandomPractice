package secondWeek;

import java.util.Scanner;

public class PracticalScanner3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요.");
				
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");	
		int num2 = scan.nextInt();
		
//		if(num1 > num2) {
//			System.out.println(num1 + "이 큰 수입니다.");
//		} else if(num2 > num1) {
//			System.out.println(num2 + "이 큰 수입니다.");
//		} else {
//			System.out.println("같은 수 입니다.");
//		}
		
		if(num1 != num2) {
			System.out.println("같은 수 입니다.");
			if(num1> num2) {
				System.out.println(num1 + "이 큰 수 입니다.");
				} else {
					System.out.println(num2 + "이 큰 수 입니다.");
				}
			}
			
		else {
			System.out.println("다른 수 입니다.");
				
		}
	}
		
}
