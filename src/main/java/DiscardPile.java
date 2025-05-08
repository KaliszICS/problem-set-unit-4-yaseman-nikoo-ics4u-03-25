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
        if(card==null){
            return this.discardPile;
        }
        Card[] newDiscardPile= new Card[this.discardPile.length];
        newDiscardPile[this.discardPile.length-1]= card;
        for(int i=0;i<this.discardPile.length;i++){
            newDiscardPile[i]=this.discardPile[i];
        }
        this.discardPile=newDiscardPile;
        return this.discardPile;
    }
    public Card[] removeCard(Card card){
        if (card==null){
            return null;
        }
        int index=-1;
        
        for(int i=0; i<this.discardPile.length;i++){
            if(this.discardPile[i].getName().equals(card.getName())&& this.discardPile[i].getValue()==card.getValue()&&this.discardPile[i].getSuit().equals(card.getSuit())){
                index=i;
            }
        }
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
        return null;
    }
    public Card[] removeAll(){
        Card[] card=new Card[this.discardPile.length];
        for (int i=0;i<this.discardPile.length;i++){
            card[i]=this.discardPile[i];
        }
        // So the empty will exception????
        this.discardPile=new Card[0];
        return card;
    }
    public String toString(){
        String cards="";
        for(int i=0;i<this.discardPile.length;i++){
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