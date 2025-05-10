/**
 * A class representing the player in the game with the name, age ad the cards in the hand of the player.
 * @author Yaseman Nikoo
 * @version 1.9 2025/05/09
 */

public class Player {
    private String name;
    private int age;
    private Card[] cards;
    /**
     * A constructor that create a player with name, age and the cards in his hand
     * @param name name of the player
     * @param age age of the player
     * @param cards cards of the player
     */
    public Player(String name, int age, Card[] cards){
        this.name=name;
        this.age=age;
        this.cards=cards;
    }
    /**
     * A constructor that creates a a player with name, age and a empty hand
     * @param name name of the player
     * @param age age of the player
     */
    public Player(String name, int age){
        this.name=name;
        this.age=age;
        this.cards=new Card[0];
    }
    /**
     * A method to return the name of the player
     * @return name of the player as String
     */
    public String getName(){
        return this.name;
    }
    /**
     * A method to return the age of the player
     * @return the age of the player as integer.
     */
    public int getAge(){
        return this.age;
    }
    /** 
     * A method to return the cards in the hand of the player
     * @return the cards in the players hand as an array of Card.
     */
    public Card[] getCard(){
        return this.cards;
    }
    /**
     * Return the number of the cards in the players hand
     * @return the size of the cards as integer
     */
    public int size(){
        if (this.cards==null){
            return 0;
        }
        return this.cards.length;
    }
    /**
     * Draw a card from the given deck and put it in the hand
     * @param deck the deck that the card is being taken from
     */
    public void draw(Deck deck){
        if(this.cards==null){
            return;
        }
        Card[] newcard=new Card[this.cards.length+1];
        for(int i=0;i<this.cards.length;i++){
            newcard[i]=this.cards[i];
        }
        newcard[this.cards.length]=deck.draw();
        this.cards=newcard;
    }
    /**
     * Disccard a card from the player's hand to the discard pile
     * @param card the card to discard
     * @param discardPile the pile to take the card from
     * @return the true or false of whether the card exists in the hand
     */
    public boolean discardCard(Card card, DiscardPile discardPile){
        Card[] newHand=new Card[this.cards.length-1];
        int index=-1;
        //Finding the card in the hand
        for(int i=0; i<this.cards.length;i++){
            if(this.cards[i].getName().equals(card.getName())&&cards[i].getSuit().equals(card.getSuit())&&cards[i].getValue()==card.getValue()){
                index=i;
            }
        }
        if(index==-1){
            return false;
        }
        //removing hte card fromt the hand
        for(int x=0;x<this.cards.length;x++){
            if(x<index){
                newHand[x]=this.cards[x];
            }
            else if(index<x){
                newHand[x-1]=this.cards[x];
            }   
        }
    
        this.cards=newHand;
        discardPile.addCard(card);
        return true;
    }
    /**
     * Return a card from the player's hand back to the card
     * @param card the card to return
     * @param deck the deck to return to
     * @return true or false of whether the card exist in the hand
     */
    public boolean returnCard(Card card, Deck deck){
        int index = -1;
        for(int i = 0; i < this.cards.length; i++){
        //finding the card
            if(this.cards[i].getName().equals(card.getName()) && this.cards[i].getSuit().equals(card.getSuit()) &&this.cards[i].getValue() == card.getValue()){
                index = i;
                break;
            }
        }
        if(index == -1){
            return false;
        }
        deck.addCard(card);
        // Remove card from hand
        Card[] newHand = new Card[this.cards.length - 1];
        for(int x = 0; x < this.cards.length; x++){
            if(x < index){
                newHand[x] = this.cards[x];
            } 
            else if(x > index){
                newHand[x - 1] = this.cards[x];
            }
        }   
    this.cards = newHand;
    return true;
    }
    /**
     * Return an string represeantation of the player with this name, this age, and the sut and name of the cards
     * @return a string representation of the player
     */
    public String toString(){
        String name="";
        name=name+ this.name+ ", "+ this.age+", ";
        if (this.cards == null || this.cards.length == 0) {
            return name + "no cards.";
        }
        for(int i=0;i<this.cards.length;i++){
            if(i==this.cards.length-1&& this.cards[i]!=null){
                name=name +this.cards[i].getName()+ " of "+ cards[i].getSuit()+".";
            }
            else if( this.cards[i]!=null){
                name=name +this.cards[i].getName()+ " of "+ cards[i].getSuit()+", ";}
        }
        return name;
    }
}
