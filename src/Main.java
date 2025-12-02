//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Deck d = new Deck();
        d.shuffle();
        Player Alice = new Player("Alice");
        Player Bob = new Player("Bob");
        System.out.println("Both player are drawing cards!");
        Alice.drawStartingHand(d);
        Bob.drawStartingHand(d);
        String[] rounds = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
        for(String round : rounds) {
        	Card a = Alice.playCard();
        	Card b = Bob.playCard();
        	System.out.println("\n\nROUND "+round+": "
        					+ "\nAlice plays: " + a
        					+ "\nBob plays: " + b);
        	if(a.getValue() > b.getValue()) {
        		System.out.println("ALICE WINS ROUND " + round);
        		Alice.addPoint();
        	}
        	else if(a.getValue() < b.getValue()) {
        		System.out.println("BOB WINS ROUND " + round);
        		Bob.addPoint();
        	}
        	else {
        		System.out.println("ITS A TIE!");
        	}
        }
        String winner;
        System.out.println("\n\n\nALICE GOT "+Alice.getScore()+" POINTS!");
        System.out.println("BOB GOT "+Bob.getScore()+" POINTS!");
        if(Alice.getScore()>Bob.getScore()) winner = "ALICE";
        else if(Alice.getScore()<Bob.getScore()) winner = "BOB";
        else {winner = "ITS A TIE NO-ONE";}
        System.out.print(winner + " WINS!\n\n\n");
    }
}