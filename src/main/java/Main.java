public class Main{
public static void main(String[] args) {

    Deck deck=new Deck();
    int x=deck.size();
    deck.addCard(new Card("king","Spade",13));
    for(int i=0;i<x;i++){
        System.out.println(deck.draw());
        
    }
}
}