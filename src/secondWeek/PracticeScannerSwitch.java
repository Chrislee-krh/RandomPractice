package secondWeek;

import java.util.Scanner;

public class PracticeScannerSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		
		int price = 1;
				
		System.out.print("> ");
		String chosenFruit = scan.next();
	
		
		switch(chosenFruit){
			case "수박":
				price = price + 1;
				break;
			case "사과":
				price = price + 2;
				break;
			case "멜론":
				price = price + 3;
				break;
			case "포도":
				price = price + 4;
				break;
			case "귤":
				price = price + 5;
				break;
			default :
				System.out.println(chosenFruit + "(은)는 메뉴에 없습니다.");
		}
			
			System.out.println(chosenFruit + "의 가격은 " + price + "만원 입니다.");
		
	}

}
