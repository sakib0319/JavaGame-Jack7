package Jack7;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckofCards {
    private Card[] deck ;
    private int presentCard;
    private Random random = new Random();
    List<Image> allCards = new ArrayList<>();
    public DeckofCards(){
        deck = new Card[52];
        String[] values = { "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
        String[] suits = {  "Clubs", "Diamonds","Hearts", "Spades" };
        presentCard=0;

        allCards.add(new Image("file:2_of_clubs.png"));
        allCards.add(new Image("file:3_of_clubs.png"));
        allCards.add(new Image("file:4_of_clubs.png"));
        allCards.add(new Image("file:5_of_clubs.png"));
        allCards.add(new Image("file:6_of_clubs.png"));
        allCards.add(new Image("file:7_of_clubs.png"));
        allCards.add(new Image("file:8_of_clubs.png"));
        allCards.add(new Image("file:9_of_clubs.png"));
        allCards.add(new Image("file:10_of_clubs.png"));
        allCards.add(new Image("file:jack_of_clubs2.png"));
        allCards.add(new Image("file:queen_of_clubs2.png"));
        allCards.add(new Image("file:king_of_clubs2.png"));
        allCards.add(new Image("file:ace_of_clubs.png"));

        allCards.add(new Image("file:2_of_diamonds.png"));
        allCards.add(new Image("file:3_of_diamonds.png"));
        allCards.add(new Image("file:4_of_diamonds.png"));
        allCards.add(new Image("file:5_of_diamonds.png"));
        allCards.add(new Image("file:6_of_diamonds.png"));
        allCards.add(new Image("file:7_of_diamonds.png"));
        allCards.add(new Image("file:8_of_diamonds.png"));
        allCards.add(new Image("file:9_of_diamonds.png"));
        allCards.add(new Image("file:10_of_diamonds.png"));
        allCards.add(new Image("file:jack_of_diamonds2.png"));
        allCards.add(new Image("file:queen_of_diamonds2.png"));
        allCards.add(new Image("file:king_of_diamonds2.png"));
        allCards.add(new Image("file:ace_of_diamonds.png"));

        allCards.add(new Image("file:2_of_hearts.png"));
        allCards.add(new Image("file:3_of_hearts.png"));
        allCards.add(new Image("file:4_of_hearts.png"));
        allCards.add(new Image("file:5_of_hearts.png"));
        allCards.add(new Image("file:6_of_hearts.png"));
        allCards.add(new Image("file:7_of_hearts.png"));
        allCards.add(new Image("file:8_of_hearts.png"));
        allCards.add(new Image("file:9_of_hearts.png"));
        allCards.add(new Image("file:10_of_hearts.png"));
        allCards.add(new Image("file:jack_of_hearts2.png"));
        allCards.add(new Image("file:queen_of_hearts2.png"));
        allCards.add(new Image("file:king_of_hearts2.png"));
        allCards.add(new Image("file:ace_of_hearts.png"));

        allCards.add(new Image("file:2_of_spades.png"));
        allCards.add(new Image("file:3_of_spades.png"));
        allCards.add(new Image("file:4_of_spades.png"));
        allCards.add(new Image("file:5_of_spades.png"));
        allCards.add(new Image("file:6_of_spades.png"));
        allCards.add(new Image("file:7_of_spades.png"));
        allCards.add(new Image("file:8_of_spades.png"));
        allCards.add(new Image("file:9_of_spades.png"));
        allCards.add(new Image("file:10_of_spades.png"));
        allCards.add(new Image("file:jack_of_spades2.png"));
        allCards.add(new Image("file:queen_of_spades2.png"));
        allCards.add(new Image("file:king_of_spades2.png"));
        allCards.add(new Image("file:ace_of_spades.png"));

        for(int i = 0; i<deck.length;i++)
        {
            deck[i] = new Card(values[i%13],suits[i/13],allCards.get(i));
        }
        shuffle();
    }
    public void shuffle()
    {
        for(int i=0;i<deck.length;i++)
        {
            int j = random.nextInt(52);
            Card temp = deck[i];
            deck[i]=deck[j];
            deck[j]=temp;
        }
    }
    public Card dealCard()
    {
        return deck[presentCard++];
    }

}
