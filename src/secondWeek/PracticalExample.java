package secondWeek;

public class PracticalExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*100) + 1;
		System.out.println("랜덤 수는: " + num);
//		String str  = (num % 2 == 1) ? "3항 연산의 결과: 홀수" : "3항 연산의 결과: 짝수";
//	    System.out.println(str);
	
		//if 사용한 방법1
//	    if(num%2 == 1) {
//	    	System.out.println("3항 연산의 결과는 홀수입니다.");
//	    } else {
//	    	System.out.println("3항 연산의 결과는 짝수입니다.");
//	    }
//	    
		//if 사용한 방법
	    System.out.println("3항 연산의 결과: " + (num%2 == 1 ? "홀수" : "짝수" ));
	    
	    int num2 = (int)(Math.random()*11) - 5;
	    System.out.println("랜덤 값: " + num2);
	    int abs = (num2 < 0) ? -num2: num2;
	    System.out.println(num2 + "의 절대 값: " + abs);
	    	    
	}

}
