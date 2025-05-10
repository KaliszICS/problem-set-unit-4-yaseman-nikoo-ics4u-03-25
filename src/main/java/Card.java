/**
 * Represeanting plyaing cards with name, suit, and values
 * @author Yaseman Nikoo
 * @version 1.3 2025/05/09
 */
public class Card{
    private String name;
    private String suit;
    private int value;
    /**
     * The constructor that create a new Card with name, suit and value.
     * @param name show the name of the Card(e.g. "Ace","2",...)
     * @param suitshow the suit of the card(e.g. "Hearts","Clubs","Dimonds","Spades")
     * @param value
     */
    public Card(String name, String suit, int value){
        this.name=name;
        this.suit=suit;
        this.value=value;
    }
    /**
     * Return the card's name
     * @return the name of the card as the String
     */
    public String getName(){
        return this.name;
    }
    /**
     * return the suits of the card
     * @return the suits of the card as the String
     */
    public String getSuit(){
        return this.suit;
    }
    /**
     * return the value of the card
     * @return value of the card as integer
     */
    public int getValue(){
        return this.value;
    }
    /**
     * Return the String representation fo the card in form of this name of this suit.
     * @return the card's name and suit in form of string
     */
    @Override
    public String toString(){
        return this.name +" of "+ this.suit;
    }
    /**
     * Compare this card to the object. The result is true if the name, suit, and the value of the objects are equal.
     * @return it will return true or false as booleans based on the comparison
     */
    @Override
    public boolean equals(Object obj){
        Card card=(Card) obj;
        if(card==null || !card.getClass().equals(this.getClass())){
            return false;
        }
        if(card.getName().equals(this.name)&& card.getValue()==this.value&& card.getSuit().equals(this.suit)){
            return true;
        }
        return false;
    }
}