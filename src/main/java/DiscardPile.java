public class DiscardPile{
    private Card[] discardPile;
    public DiscardPile(Card[] card){
        this.discardPile=card;
    }
    public DiscardPile(){
        this.discardPile=new Card[0];
    }
    public Card[] getDiscardPile(){
        return this.discardPile;
    }
    public int size(){
        return this.discardPile.length;
    }
    public Card[] addCard(Card card){
        Card[] newDiscardPile= new Card[this.discardPile.length];
        newDiscardPile[this.discardPile.length-1]= card
        for(int i=0;i<this.discardPile.length;i++){
            newDiscardPile[i]=this.discardPile[i];
        }
        this.discardPile=newDiscardPile;
        return this.discardPile;
    }
}