package thirdWeek5thHW.quiz10;

public class Warrior extends Player {


	Warrior(String name, int hp, int mp) {
		super(name);
		this.hp = hp;
		this.mp = mp;
	}
	
	Warrior(String name){
		this(name, 1000, 500);
	}

	public void bash(Player p) {
		p.hp -= dmg;
//		this.hp = p.hp;
		System.out.println(p.name + "님 배쉬 스킬 사용 적중");
		System.out.println();
	}
	
	public void info() {
		System.out.println("케릭명: " + name);
		System.out.println("체력: " + hp);
		System.out.println("마나: " + mp);
	}
}
