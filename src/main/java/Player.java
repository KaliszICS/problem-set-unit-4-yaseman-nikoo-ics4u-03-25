public class Player {
    private String name;
    private int age;
    private Card[] cards;
    public Player(String name, int age, Card[] cards){
        this.name=name;
        this.age=age;
        this.cards=cards;
    }
    public Player(String name, int age){
        this.name=name;
        this.age=age;
        this.cards=new Card[0];
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Card[] getCard(){
        return this.cards;
    }
    public int size(){
        return this.cards.length;
    }
    public void draw(Deck deck){
        Card[] newcard=new Card[this.cards.length+1];
        for(int i=0;i<this.cards.length;i++){
            newcard[i]=this.cards[i];
        }
        newcard[this.cards.length]=deck.draw();
        this.cards=newcard;
    }
    public boolean discardCard(Card card, DiscardPile discardPile){
        
    }
    public boolean returnCard(Card card, Deck deck){
        deck.addCard(card);
        for(int i=0; i<cards.length;i++){
            if(cards[i].getName().equals(card.getName())&&cards[i].getSuit().equals(card.getSuit())&&cards[i].getValue()==card.getValue()){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String name="";
        name=name+ this.getName()+ ", "+ this.getAge()+", ";
        for(int i=0;i<cards.length;i++){
            if(i==cards.length-1){
                name=cards[i].getName()+ " of "+ cards[i].getSuit()+".";
            }
            name=cards[i].getName()+ " of "+ cards[i].getSuit()+", ";
        }
        return name;
    }
}
