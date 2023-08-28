package secondWeek;

public class PracticalFor3 {

	public static void main(String[] args) {
		for (int i = 100 ; i > 0; i--) {
//			System.out.println(i+" ");
		}
		
		int sum = 0;
		for (int j = 1; j <= 200; j++) {
			if(!(j%2 == 0 || j%3 == 0)) {
				sum += j;
			}
//		} System.out.println("1~200사이의 수 중에 2또는 3의 배수가 아닌 수 들의 총합: " + sum);
	
		
		// 성공한 첫 번째 방법
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for(int x = 1; x <= 10; x++) {
//			sum1 += x*(11-x);
//			}
//					
//		sum2 += sum1;
//		
//		System.out.println("1+(1+2)+---+(1+2+---+10)의 총합: " + sum2);
		
		// 두 번째 방법
//		int sum1 = 0;
//		
//		for (int x = 1; x <= 10; x++) {
//			System.out.print((x>1 ? "(" : ""));
//				for (int y =1; y <= x; y++) {
//				sum1 += y;
//				System.out.print(y);
//				if(y<x && y!=10) {
//					System.out.print("+");
//				} else {
//					System.out.print("");
//				}
//				}
//			System.out.print((x == 1 ? "" : ")"));
//			if(x<10) {
//				System.out.print("+");
//		
//			}
//		} 
//		System.out.println(": " + sum1);
//		System.out.println();
//	

		// 강사님의 답
		sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			sum2 += sum;
		}
		System.out.println("반복문 하나로 푼 결과: " + sum2);
	
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i!=1) System.out.print("+(");
			for (int j1 = 1; j1 <= i; j1++) {
				//소괄호 안의 더하기
				sum += j1;
				System.out.print(j1);
				if(j1!=i) System.out.print("+"); //끝
			}
			if(i!=1) System.out.print(")");
		}
		System.out.println("\n반복문 두개로 푼 결과: " + sum);
	}
	}
}
