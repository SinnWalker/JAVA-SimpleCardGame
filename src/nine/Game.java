package nine;

public class Game {

    Deck deck = new Deck();
    Player player1 = new Player("Pl1");
    Player player2 = new Player("Pl2");

    public Game(){

        for(int i=0; i <5; i++){
            deck.shuffle();
            Card card1 = deck.cards.get(0);
            Card card2 = deck.cards.get(1);

            int val1 = card1.getValue().getValueNumber();
            int val2 = card2.getValue().getValueNumber();

            if(val1 < val2){
                player2.addPoints();
            }
            else if (val1 > val2){
                player1.addPoints();
            }
            else{
                i--;
            }
        }

        int pl1points = player1.getPoints();
        int pl2points = player2.getPoints();

        if(pl1points > pl2points){
            System.out.println(player1.getName() + " wins with " + pl1points + " points!");
        }
        else if(pl2points > pl1points){
            System.out.println(player2.getName() + " wins with " + pl2points + " points!");
        }
        else {
            System.out.println("it's a draw");
        }
    }


}
