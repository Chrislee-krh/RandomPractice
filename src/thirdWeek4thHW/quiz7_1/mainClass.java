package thirdWeek4thHW.quiz7_1;

public class mainClass {

	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		String[] sArr = {"홍길동", "이순신", "김길동"};
		int[] iArr = {1,2,3,4,5};
		char[] cArr = {'가', '나'};
		
		ap.printArray(sArr);
		ap.printArray(iArr);
		ap.printArray(cArr);

	}

}
