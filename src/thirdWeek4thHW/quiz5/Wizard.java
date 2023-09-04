package thirdWeek4thHW.quiz5;

public class Wizard extends classT{

	@Override
	void info(String name, int hp, int mp) {
		System.out.println("----마법사----");
		super.info(name, hp, mp);
		System.out.println("얼음화살 사용");
	}

}