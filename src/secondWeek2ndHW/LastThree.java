package secondWeek2ndHW;

import java.util.Random;
import java.util.Scanner;

public class LastThree {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요> ");
//		int num = scan.nextInt();
//		int sum = 0;
//		
//		for (int i = 2; i <= num; i++) {
//		int cnt = 0;
//			for (int j = 1; j<= i; j++) {
//				if(i%j == 0) cnt++;
//				
//				
//			}
//			if(cnt == 2) sum += i;
//		}
//		System.out.println(sum);
		
//		System.out.println("--------------------");
//		Scanner scan = new Scanner(System.in);
//		Random rand = new Random();
//		int cnt1 = 0;
//		int cnt2 = 0;
//		
//		while(true) {
//			
//			int num1 = rand.nextInt(100);
//			int num2 = rand.nextInt(100);
//			
//			if (num1<=num2) {
//			System.out.println(num1 + "+" + num2 + "=" + "?");
//			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
//			System.out.print("> " );
//			int num3 = scan.nextInt();
//				
//			if (num3 == num1+num2) {
//				System.out.println("정답입니다!!"); 
//				cnt1++;
//			} else if(num3 == 0) {
//				break;
//			} else {
//			  System.out.println("틀렸는데요??"); 
//			  cnt2++;
//			 }
//			
//			System.out.println("정답의 수: " + cnt1);
//			System.out.println("오답의 수: " + cnt2);
//			} else {
//				System.out.println(num1 + "-" + num2 + "=" + "?");
//				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
//				System.out.print("> " );
//				int num3 = scan.nextInt();
//					
//				if (num3 == num1-num2) {
//					System.out.println("정답입니다!!"); 
//					cnt1++;
//				} else if(num3 == 0) {
//					break;
//				} else {
//				  System.out.println("틀렸는데요??"); 
//				  cnt2++;
//				 }
//				
//				System.out.println("정답의 수: " + cnt1);
//				System.out.println("오답의 수: " + cnt2);
//			}
//				
//		}
//	
		Scanner scan = new Scanner(System.in);
		
		int dPrice = 400;
		int mPrice = 500;
		int cPrice = 600;
		int amt = 0;
		int remain = 0;
		System.out.print("금액을 투입해 주세요> ");
		int ownM = scan.nextInt();
		
		while(true) {
				
			System.out.println("남은 금액: " + ownM);
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코카골라: 600원, [4]잔돈받기");
			System.out.print("음료수 선택> ");
			int menu = scan.nextInt();
			if (menu>=1&&menu<=4) {	
				switch(menu) {
				case 1:
					if(ownM<dPrice) System.out.println("금액이 부족합니다.");
					else {
					remain = ownM - dPrice; 
					break;
					}
					
				case 2:
					if(ownM<mPrice) System.out.println("금액이 부족합니다.");
					else {
						remain = ownM - mPrice; 
						break;
						}
					
				case 3:
					if(ownM<cPrice) System.out.println("금액이 부족합니다.");
					else {
						remain = ownM - cPrice; 
						break;
						}
					
				case 4:
					remain = ownM;
					System.out.println("남은 금액을 반환합니다: " + remain + "원");
					scan.close();
					System.exit(0);
					break;
				}
			} else {
				System.out.println("메뉴선택은 1번부터 4번까지 숫자를 입력해주세요!");
			}
			ownM = remain;
		}
		
	}
	
}