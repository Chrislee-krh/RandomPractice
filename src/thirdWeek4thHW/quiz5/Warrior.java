package thirdWeek4thHW.quiz5;

public class Warrior extends classT {

	@Override
	void info(String name, int hp, int mp) {
		System.out.println("----전사----");
		super.info(name, hp, mp);
		System.out.println("때리기 스킬 사용");
	}
	
}
