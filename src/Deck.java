

public class Deck {
    public static void main(String[] args) {

        Card[] arr = new Card[52]; //deck of size 52

        //Card.rank.values() returns an array of all the values in the enum Rank so we can access them using an index
        
        for(int i = 0; i < arr.length; i+= 4){
           arr[i] =(new Card(Card.Suit.SPADES, Card.Rank.values()[i]));
            arr[i+1] = (new Card(Card.Suit.HEARTS, Card.Rank.values()[i]));
            arr[i+2] = (new Card(Card.Suit.DIAMONDS, Card.Rank.values()[i]));
            arr[i+3] = (new Card(Card.Suit.CLUBS, Card.Rank.values()[i]));
        }

        for(Card card : arr){
            System.out.println(card.getRank() + " of " + card.getSuit());
        }

    }
}
