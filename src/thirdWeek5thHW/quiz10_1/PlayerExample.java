package thirdWeek5thHW.quiz10_1;

public class PlayerExample {

	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한친구대한전사");
		
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");
		
		System.out.println("---나의 케릭 배쉬 스킬 사용---");
		me.bash(play2);
		me.bash(play3);
		
		play2.info();
		play3.info();
		
	}

}
