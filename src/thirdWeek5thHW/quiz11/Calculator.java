package thirdWeek5thHW.quiz11;

public class Calculator {

	public static double pi = 3.14;
	
	int result;
	static double circum;
	
	public static double circle(int r) {
		circum = 2 * pi * r;
		System.out.println(circum);
		return circum;
	}
	
	int add(int a) {
		result += a;
		return result;
	}
		
	int add(int a, int b) {
		result += a+b;
		return result;
	}
	
	int add(int a, int b, int c) {
		result += a+b+c;
		return result;
	}
	
	int add(int a, int b, int c, int d) {
		result += a+b+c+d;
		return result;
	}
	
}
