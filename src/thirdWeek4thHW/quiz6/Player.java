package thirdWeek4thHW.quiz6;

public class Player {

	String name;
	int hp;
	int mp;
			
	void info(String name, int hp, int mp) {
		
		System.out.println("케릭명: " +  name);
		System.out.println("체력: " + hp);
		System.out.println("마나: " + mp);
	}

	void action(String str1, String str2) {
		System.out.println("----" + str1 + "----");
		System.out.println(str1 + "는 " + str2 +"동작을 합니다." );
	}
	
}
