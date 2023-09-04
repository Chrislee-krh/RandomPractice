package thirdWeek5thHW.quiz10_2;

public class Warrior extends Player {

	int dmg = 100;
	
	Warrior(String name, int hp, int mp) {
	this.name = name;
	this.hp = 1000;
	this.mp = 500;
		
	}
	
	Warrior(String name){
		this(name, 1000, 500);
	}

	public void bash(Player p) {
		if(p instanceof Warrior) {
			p.hp -= dmg;
		} else if(p instanceof Wizard) {
			p.hp -= (dmg*2);
		}
		this.hp = p.hp;
		System.out.println(p.name + "님 배쉬 스킬 사용 적중");
		System.out.println();
	}
	
	public void info() {
		System.out.println("케릭명: " + name);
		System.out.println("체력: " + hp);
		System.out.println("마나: " + mp);
	}
}
