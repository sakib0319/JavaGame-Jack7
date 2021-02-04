package Jack7;

import javafx.scene.image.Image;

public class Card {
    String value;
    String suit;
    Image image;

    public Card(String value, String suit , Image image) {
        this.value = value;
        this.suit = suit;
        this.image = image;
    }
    public boolean compare(Card aa){
        if(this.value.equalsIgnoreCase(aa.value)&&this.suit.equalsIgnoreCase(aa.suit))
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}
