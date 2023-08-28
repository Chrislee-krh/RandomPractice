package secondWeek;

public class multiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("구구단이 시작합니다.");
		for (int i = 1; i <= 9; i++) {
						
			for (int j = 2; j <= 9; j++) {
				int result = i * j;
				//if()
				//System.out.print(j + "단 " + "\t");
				System.out.print(j + "*" + i+ "=" + result + "\t");
				
			}
			System.out.println("\n");
		}
		
		System.out.println("구구단이 종료됩니다.");
				
	}

}

