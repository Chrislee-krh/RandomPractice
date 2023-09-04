package thirdWeek4thHW.quiz8;

public class Warrior extends Player {
	
	public Warrior(String name, int hp, int mp) {
		super(name);
		this.hp = hp;
		this.mp = mp;
	}
	
	public Warrior(String name) {
		this(name, 1000, 500);
	}

	public void info() {
		System.out.println("케릭명: " + this.name);
		System.out.println("체력: " + this.hp);
		System.out.println("마나: " + this.mp);
	}
}
