package thirdWeek4thHW.quiz7;

public class Calculation {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(1);
		System.out.println("cal1의 누적값: " +  cal.result);
		cal.add(2,3);
		System.out.println("cal1의 누적값: " +  cal.result);
	}

}
