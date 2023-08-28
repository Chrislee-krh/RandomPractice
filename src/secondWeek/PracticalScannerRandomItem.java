package secondWeek;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticalScannerRandomItem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String[] fruitList = {"수박", "사과", "멜론", "포도", "귤"};
		
		System.out.println("구입할 메뉴는?");
		
		System.out.println(Arrays.toString(fruitList));
		
		int indexNumber = rand.nextInt(fruitList.length);
				
		String randomFruit = fruitList[indexNumber];
		
		System.out.println(fruitList + "가 선택됐습니다." );
				
		int price = 1;
				
		switch(randomFruit){
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
				System.out.println(randomFruit + "(은)는 메뉴에 없습니다.");
		}
			
			
			System.out.println(randomFruit + "의 가격은 " + price + "만원 입니다.");
		

	}

}
