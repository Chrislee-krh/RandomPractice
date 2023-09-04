package thirdWeek4thHW;

public class DAccountExample {

	public static void main(String[] args) {
		DAccount myAcc = new DAccount("홍길동", "1234", 3600);
		
		myAcc.deposit(800);
		myAcc.withDrwa(1900);
		
		int bal = myAcc.getBalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은: " + myAcc.balance + "원입니다.");
	}

}
