package secondWeek;

import java.util.Scanner;

public class PracticalScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요> ");
		int num = scan.nextInt();
		
		String str = (num%2 ==1) ? "홀수" : "짝수";
		System.out.println("입력받은 수는: " + str);
		
		System.out.println("입력받은 수는: " +(num%2 == 0? "짝수" : "홀수"));
		
	}

}
