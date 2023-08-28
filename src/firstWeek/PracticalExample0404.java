package firstWeek;

import java.util.Random;

public class PracticalExample0404 {

	public static void main(String[] args) {
				
		System.out.println("6세 이상 탑승 가능(단, 키가 120cm이상이면 보호자 동반하에 탑승 가능)");
		
		Random rand = new Random();
		
		int age = rand.nextInt(20);
		double height = rand.nextDouble(100.0, 200.0);
		boolean parent = rand.nextBoolean();
		boolean heartDisease = rand.nextBoolean();
		
		System.out.println("나이= " + age + "세");
		System.out.println("키= " + height + "cm");
		
		if(parent = true) {
			System.out.println("부모님과 동승 가능합니다." );
		} else {
			System.out.println("부모님이 동승하실 수 없습니다.");
		}
		
		System.out.println("나이= " + age);
		
		if (age >= 6 || (height >= 120 && parent && !heartDisease)) {
			System.out.println("탑승이 가능합니다.");
		} else {
			System.out.println("탑승이 불가능합니다");
			
				
		}

	}

}
