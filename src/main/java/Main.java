public class Main{
public static void main(String[] args) {
    Card[] cards=new Card[0];
    Deck deck=new Deck();
    cards=null;
    DiscardPile discard=new DiscardPile();
    Card[] card={new Card("King", "Spade", 13), new Card("Queen", "Dimonds", 12)};
    Player player=new Player("Yaseman",18,card);
    /*System.out.println(player.getCard());
    System.out.println(player.toString());
    System.out.println(player.size());*/
    //player.draw(deck);
    
    System.out.println(player.discardCard(new Card("King","Spade",13),discard));
    System.out.println(deck.toString());
    System.out.println(player.toString());


  
    }
}
