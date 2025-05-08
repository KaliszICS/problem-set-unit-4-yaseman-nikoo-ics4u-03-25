public class Main{
public static void main(String[] args) {
    Card[] card={new Card("King", "Spade", 13), new Card("Queen", "Dimonds", 12)};
    DiscardPile discard=new DiscardPile(card);
    System.out.println(discard.getDiscardPile()[0]);
   
    

    System.out.println(discard.toString());
    }
}
