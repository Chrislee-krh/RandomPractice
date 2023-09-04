package thirdWeek5thHW.quiz10_2;

public class PlayerExample {

	public static void main(String[] args) {
				
		Warrior w1 = new Warrior("강한친구");
		Wizard w2 = new Wizard("구르미");
		Warrior me = new Warrior("나의케릭터");
		
		Player[] players = {w1, me};
		
	    w2.blizzard(players);
	    w2.blizzard(players);
	    w2.blizzard(players);
	    w2.blizzard(players);
	    w2.blizzard(players);
//		w2.blizzard();
		
	}

}
