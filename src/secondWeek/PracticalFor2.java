package secondWeek;

public class PracticalFor2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 1) {
				sum += i;
			} 
		}
		System.out.println("1~100사이의 홀수의 합: " + sum);
//			else {
//				continue; 도 가능함.
//			}
//			
//		}

	}

}
