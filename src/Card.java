public class Card {

    public enum Suit{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    }
    public enum Rank {
        ACE,
        TWO ,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    public Suit getSuit(){
        return suit;
    }
    public Rank getRank(){
        return rank;
    }

    public boolean equals(Card other){
        return rank == other.getRank() && suit == other.getSuit();
    }
    
}
