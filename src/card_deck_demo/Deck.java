

public class Deck {
    private static Card [] arr;
    public static void main(String[] args) {

        arr = new Card[52]; //deck of size 52

        //Card.rank.values() returns an array of all the values in the enum Rank so we can access them using an index
        
        for(int i = 0; i < arr.length; i+= 4){
           arr[i] =(new Card(Card.Suit.SPADES, Card.Rank.values()[i]));
            arr[i+1] = (new Card(Card.Suit.HEARTS, Card.Rank.values()[i]));
            arr[i+2] = (new Card(Card.Suit.DIAMONDS, Card.Rank.values()[i]));
            arr[i+3] = (new Card(Card.Suit.CLUBS, Card.Rank.values()[i]));
        }

    }
    public void shuffle(){
        /* TODO: 
        * using the swap method, effectively "shuffle" the deck 
        *
        * hint: swap 2 random indexes (using math.random) 7 different times (call swap method in a loop 
        * that executes 7 times)
        *
        */
    }
    public void swap(int index1, int index2){
        /* TODO: 
         * 
         * swap the elements at the two given indexes
         * 
         * why are we able to have a void return type rather than returning the updated card array?
         * 
         */
        
    }

    public void printDeck(){
        /*TODO: 
         * Print the deck out with a comma in between each card, but without a comma after the last card 
         * 
         */

    }

    public Card[] draw5(){
        //TODO: Draw 5 cards from the deck and return them in an Array of Cards that will hold 5 Cards

        //Hint: You will need to create a new array of 5 cards- which side of the array do you want to draw from? 
        //how do you want to check if a current location is null? - do you want to resize the array? 
        return null;
    }


}
