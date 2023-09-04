package thirdWeek5thHW.quiz10_1;

public class Wizard extends Player{
	
	Wizard(String name, int hp, int mp) {
		super(name);
		this.hp = hp;
		this.mp = mp;
	}

	Wizard(String name){
		this(name, 500, 1000);
	}
		
	public void info() {
		System.out.println("케릭명: " + this.name);
		System.out.println("체력: " + this.hp);
		System.out.println("마나: " + this.mp);
	}
}
