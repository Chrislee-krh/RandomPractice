package fourthWeek6thHW;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 13자리를 입력하세요: ");
		String ssn = scan.nextLine();
			if(ssn.contains("-")) { 
				ssn = ssn.replace("-", "");
			} 
			if(ssn.charAt(6)==48) {
				System.out.println("남성");
			} else if(ssn.charAt(6)==49) {
				System.out.println("여성");
			} else {
				System.out.println("주민번호가 잘못되었습니다.");
			}
		
		// 14
//		while(true) {
//		System.out.print("아이디 등록: ");
//		String id = scan.nextLine();
//			if(id.length()<5) {
//				System.out.println("5글자 이상으로 등록하세요");
//			} else {
//				System.out.println(id.trim()+ "가 등록되었습니다.");
//				break;
//			}
//		}
//		
	}

}
