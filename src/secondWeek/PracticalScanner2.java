package secondWeek;

import java.util.Scanner;

public class PracticalScanner2 {

	public static void main(String[] args) {
	
		System.out.println("키와 나이를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		double height = scan.nextDouble();
		int age = scan.nextInt();
		
		if(height>0) System.out.println("키: " + height);
		if(age>0) System.out.println("나이: " + age);
		
		System.out.println("=============================");
		
//		if (height>=140 && age>=8) {
//			System.out.println("놀이기구 탑승이 가능합니다.");
//		} else {
//			System.out.println("놀이기구 탑승이 불가능합니다.");
//		}
		
		if(height>=140) {
			if(age>=8) {
				System.out.println("가능");
			} else {
				System.out.println("불가");
				
			}
		} else {
			System.out.println("불가");
		}
		

	}

}
