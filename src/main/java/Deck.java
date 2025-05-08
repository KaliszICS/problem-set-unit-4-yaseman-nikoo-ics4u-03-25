import java.util.Random;
public class Deck{
    private Card[] deck;
    public Deck(Card[] deck){
        this.deck=deck;
    }
    public Deck(){
        this.deck=new Card[52];
        for(int i=0;i<4;i++){
            String[] suits={"Hearts","Clubs","Diamonds","Spades"};
            for(int x=0;x<13;x++){
                String[] name={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
                this.deck[i*13+x]=new Card(name[x],suits[i],x+1);
            }
        }
    }
    public int size(){
        return this.deck.length;
    }
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
    public Card[] shuffle(){
        Random rand = new Random();
        if(this.deck==null){
            return null;
        }
        for (int i = this.deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
        return this.deck;
    }
    public void addCard(Card card){
        Card[] newDeck= new Card[this.deck.length+1];
        newDeck[newDeck.length-1]=card;
        for(int i=0;i<this.deck.length;i++){
            newDeck[i]=this.deck[i];
        }
        this.deck=newDeck;
    }
    public Card[] reshuffle(Card[] card){
        Card[] newDeck=new Card[this.deck.length+ card.length];
        for(int x=0;x<this.deck.length;x++){
            newDeck[x]=this.deck[x];
        }
        for(int x=0;x<card.length;x++){
            newDeck[this.deck.length+x]=card[x];
        }
        this.deck=newDeck;
        Random rand = new Random();
        if(this.deck==null){
            return null;
        }
        for (int i = this.deck.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = this.deck[i];
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
        return this.deck;
    }
}