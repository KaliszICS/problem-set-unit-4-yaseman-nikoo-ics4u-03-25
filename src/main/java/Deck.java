import java.util.Random;
public class Deck{
    private Card[] deck;
    public Deck(Card[] deck){
        this.deck=deck;
    }
    public Deck(){
        this.deck=new Card[52];
        for(int i=0;i<4;i++){
            String[] suits={"hearts","clubs","diamonds","spades"};
            for(int x=0;x<13;x++){
                String[] name={"Ace","2","3","4","5","6","7","9","10","Jack","Queen","King"};
                this.deck[i*13-1+x]=Card(name[x],suits[i],x);
            }
        }
    }
    public int size(){
        return this.deck.length;
    }
    public Object draw(){
        if (this.deck.length=0){
            return null;
        }
        Object lastcard= deck[deck.length-1];
        object[] newDeck= new object[this.deck.length-1];
        for (int z=0; z<deck.length-1; z++){
            newDeck[z]=this.deck[z];
        }
        this.deck=newDeck;
        return lastCard;
    }
    public Card[] shuffle(){
        Random rand = new Random();
        if(this.eck==null){
            return null;
        }
        for (int i = this.deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
        return this.deck;
    }
    public Card[] addCard(Card card){
        Object[] newDeck= new Card[this.deck.length+1];
        newDeck[newDeck.length-1]=card;
        for(int i=0;i<this.deck.length;i++){
            newDeck[i]=this.deck[i];
        }
        this.deck=newDeck;
    }
    public Card[] reshuffle(Card[] card){
        Object[] newDeck=new Card[this.deck.length+ card.length];
        for(int x=0;x<this.deck.length;x++){
            newDeck[x]=this.deck[x];
        }
        for(int x=0;x<card.length;x++){
            newDeckp[this.deck.length+x]=card[x];
        }
        this.deck=newDeck;
        Random rand = new Random();
        if(this.deck==null){
            return null;
        }
        for (int i = this.deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
        return this.deck;
    }
}