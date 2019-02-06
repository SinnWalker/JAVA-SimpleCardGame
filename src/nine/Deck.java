package nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();

    public Deck(){
        for(Suit suit : Suit.values()){
            for(Value value : Value.values()){
                Card card = new Card(suit, value);
                cards.add(card);            }
        }
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    @Override
    public String toString() {
        String deck = "";
        for(Card card : cards){
            deck += card.toString() + "\n";
        }
        return deck;
    }
}
