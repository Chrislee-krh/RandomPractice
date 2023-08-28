package secondWeek;

import java.util.Scanner;

public class randomPracticeProject {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String test = scan.nextLine();
		System.out.println("test 내용: " + test);
		if(test.length()==0) System.out.println("입력값이 없습니다.");
//		System.out.println("test 길이: " + test.length());
		
		int test1 = scan.nextInt(); //int는 안된다.
		System.out.println("test 내용: " + test);
		
		
		
	}

}
