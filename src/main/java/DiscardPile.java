/**
 * Represeant a pile of dicard cards
 * @author Yaseman Nikoo
 * @version 1.7 2025/05/09
 */
public class DiscardPile{
    private Card[] discardPile;
    /**
     * Constructor that add an array of Card to the discard pile
     * @param card the cards that we discard as an array of Card
     */
    public DiscardPile(Card[] card){
        this.discardPile=card;
    }
    /**
     * Constructor that creates and empty discard pile
     */
    public DiscardPile(){
        this.discardPile=new Card[0];
    }
    /**
     * Return the Discard pile array
     * @return this discardPile as an array of Card.
     */
    public Card[] getDiscardPile(){
        return this.discardPile;
    }
    /**
     * Return the numver of the cards in the  discard pile
     */
    public int size(){
        return this.discardPile.length;
    }
    /**
     * A method that add card to the discard pile and return it.
     * @param card a card that will be added
     * @return the new discard pile as an array of Card.
     */
    public Card[] addCard(Card card){
        if(card==null){
            return this.discardPile;
        }
        //Create new array with one extra space to replace with the current size
        Card[] newDiscardPile= new Card[this.discardPile.length+1];
        for(int i=0;i<this.discardPile.length;i++){
            newDiscardPile[i]=this.discardPile[i];
        }
         newDiscardPile[this.discardPile.length]= card;
        this.discardPile=newDiscardPile;
        return this.discardPile;
    }
    /**
     * A method to remove a specific card from the discard pile.
     * @param card a card that will be removed
     * @return the discard pile without the card as an array of Card.
     */
    public Card[] removeCard(Card card){
        if (card==null){
            return null;
        }
        int index=-1;
        //Finding the index of the card in the array
        for(int i=0; i<this.discardPile.length;i++){
            if(this.discardPile[i].getName().equals(card.getName())&& this.discardPile[i].getValue()==card.getValue()&&this.discardPile[i].getSuit().equals(card.getSuit())){
                index=i;
            }
        }
        //If the card does not exist
        if(index==-1){
            return null;
        }
        //Create a new array with one less element to replace with the current one
        Card[] newDiscardPile=new Card[this.discardPile.length-1];
        for(int z=0;z<this.discardPile.length;z++){
            if(z<index){
                newDiscardPile[z]=this.discardPile[z];
            }
            if(z>index){
                newDiscardPile[z-1]=this.discardPile[z];
            }
        }
        this.discardPile= newDiscardPile;
        return this.discardPile;
    }
    /**
     * Remove all the card form the discard pule
     * @return an array of Card after removing all the cards.
     */
    public Card[] removeAll(){
        Card[] card=new Card[this.discardPile.length];
        for (int i=0;i<this.discardPile.length;i++){
            card[i]=this.discardPile[i];
        }
        this.discardPile=new Card[0];
        return card;
    }
    /**
     * A method to return the representation of he discard pile in String
     * @return a String represeanting the discard pile
     */
    public String toString(){
        String cards="";
        if (this.discardPile.length == 0) {
             return "Discard pile is empty.";
        }
        for(int i=0;i<this.discardPile.length;i++){
            // for adding the last card and have a dot in the end
            if(i==this.discardPile.length-1){
                cards=cards+ this.discardPile[i].getName()+ " of "+ this.discardPile[i].getSuit()+ ".";
            }
            else{
            cards=cards+ this.discardPile[i].getName()+ " of "+ this.discardPile[i].getSuit()+ ", ";
            }
        }
        return cards;
    }

}