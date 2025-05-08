//don't forget to import anything else you need (ArrayLists, HashMaps, Scanners, etc)
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;


   //Create your tests here if you want any
 

// Assuming your classes (Card, Deck, DiscardPile, Player, GameConstants)
// are in the default package or appropriately imported.
// If they are in a specific package, add: import yourpackage.*;

public class ProblemSetTest{
    @Nested
    @DisplayName("Card Class Test")
    class CardTest{
        private Card aceOfHearts;
        private Card kingOfSpade;
        private Card twoOfDimond;
        
        @BeforeEach
        void setUp(){
            aceOfHearts=new Card("Ace", "Hearts", 1);
            kingOfSpade=new Card("King", "Spades", 13);
            twoOfDimond=new Card("2","Dimonds",2);
        }
        @Test
        @DisplayName("Getters")
        void testCardGetters() {
       assertEquals("Ace", aceOfHearts.getName());
        assertEquals("Hearts", aceOfHearts.getSuit());
        assertEquals(1, aceOfHearts.getValue());
        }
        @Test
        @DisplayName("ToString")
        void testCardToString(){
            assertEquals("Ace of Hearts", aceOfHearts.toString());
            assertEquals("King of Spades",kingOfSpade.toString());
            assertEquals("2 of Dimonds", twoOfDimond.toString());
        }
        @Test
        @DisplayName("Equals")
        void testCardEquals(){
            assertTrue(aceOfHearts.equals(aceOfHearts));
            assertTrue(!aceOfHearts.equals(kingOfSpade));
            assertTrue(!twoOfDimond.equals(null));

            assertFalse(twoOfDimond.equals(new Object()));
        }
    }
    @Nested
    @DisplayName("Deck Class Test")
    class DeckTest{
        private Card aceOfHearts;
        private Card kingOfSpade;
        private Card twoOfDimond;
        @BeforeEach
        void setUp(){
            aceOfHearts=new Card("Ace", "Hearts", 1);
            kingOfSpade=new Card("King", "Spades", 13);
            twoOfDimond=new Card("2","Dimonds",2);
        }
        @Test
        @DisplayName("Deck constructor")
        void testDeckconstructor(){
            Deck deck=new Deck();
            assertEquals(new Card("King","Spades",13),deck.draw());
        }
       // @Test
        //@DisplayName("Shuffle")
       
    }
    
}