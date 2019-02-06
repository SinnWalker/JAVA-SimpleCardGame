package nine;

public enum Suit {
    HEARTS("HEARTS"),
    DIAMONDS("DIAMONDS"),
    SPADES("SPADES"),
    CLUBS("CLUBS");

    private String suitName;

    private Suit(String suitName){
        this.suitName = suitName;
    }

    public String getSuitName(){
        return suitName;
    }
}


