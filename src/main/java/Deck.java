import java.util.Random;
/**
 * A class that represeant a deck of cards
 * @author Yaseman Nikoo
 * @version 1.5 2025/05/09
 */
public class Deck{
    private Card[] deck;
    /**
     * Constructor that create a deck with the given array of Card.
     * @param deck an array of Card.
     */
    public Deck(Card[] deck){
        this.deck=deck;
    }
    /**
     * A constructor that creates a default set of deck with 52 cards startig in the order of suits(Hearts, Clubs, Dimonds, and Spades) from Ace to King.
     */
    public Deck(){
        this.deck=new Card[52];
        String[] suits={"Hearts","Clubs","Diamonds","Spades"};
        String[] name={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        for(int i=0;i<4;i++){   
            for(int x=0;x<13;x++){
                this.deck[i*13+x]=new Card(name[x],suits[i],x+1);
            }
        }
    }
    /**
     * A method that return the number of the cards in the deck
     * @return the size of the deck as integer.
     */
    public int size(){
        return this.deck.length;
    }
    /**
     * a method that draw the last card from the deck
     * @return the last card as Card
     */
    public Card draw(){
        if (this.deck.length==0){
            return null;
        }
        Card lastcard= this.deck[this.deck.length-1];
        Card[] newDeck= new Card[this.deck.length-1];
        for (int z=0; z<this.deck.length-1; z++){
            newDeck[z]=this.deck[z];
        }
        this.deck=newDeck;
        return lastcard;
    }
    /**
     * It shuffles the deck
     * @return the deck of the card after being shuffles as Card array
     */
    public Card[] shuffle(){
        Random rand = new Random();
        if(this.deck==null){
            return null;
        }
        for (int i = this.deck.length - 1; i > 0; i--) {
            //Generating a random value for index
            int j = rand.nextInt(i + 1);
            //Swapping the elements with the element at the random index
            Card temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
        return this.deck;
    }
    /**
     * A method to add a card to the deck
     * @param card the card that is added
     */
    public void addCard(Card card){
        if(card==null){
            return;
        }
        Card[] newDeck= new Card[this.deck.length+1];
        newDeck[newDeck.length-1]=card;
        for(int i=0;i<this.deck.length;i++){
            newDeck[i]=this.deck[i];
        }
        this.deck=newDeck;
    }
    /**
     * A method to add an array of cards to the deck and the shuffle 
     * @param card the  array of cards that is added
     * @return the deck fo the card after being shuffled with the new card
     */
    public Card[] reshuffle(Card[] card){
         if(this.deck==null){
            return null;
        }
        if (card == null){
             return this.deck;
        }
        //creating a new array with the extra spaces
        Card[] newDeck=new Card[this.deck.length+ card.length];
        for(int x=0;x<this.deck.length;x++){
            //coping the values in this deck into new array
            newDeck[x]=this.deck[x];
        }
        for(int x=0;x<card.length;x++){
            //coping the values of card into the new array
            newDeck[this.deck.length+x]=card[x];
        }
        //Shufflign the array
        this.deck=newDeck;
        Random rand = new Random();
       
        for (int i = this.deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
        return this.deck;
    }
}