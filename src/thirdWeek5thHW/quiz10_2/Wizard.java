package thirdWeek5thHW.quiz10_2;

import java.util.Random;

public class Wizard extends Player{
	Random rand = new Random();
	
	Wizard(String name) {
		this.name = name;
		this.hp = 500;
		this.mp = 1000;
	}

	void iceArrow() {
		System.out.println("얼음화살 사용");
	}
	
	public void blizzard(Player[] players) {
		System.out.println("--------------------------");
		System.out.println(this.name + "님의 눈보라 시전!");
		for(Player p : players) {
			for(int i=0; i<players.length-1; i++) {
				int dmg = rand.nextInt(10, 15);
				players[i].hp -= dmg;

				System.out.println(p.name + "님이 " + dmg + "피해를 입었습니다.");
			}
		}
	}
}
