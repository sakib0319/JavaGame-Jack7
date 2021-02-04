package Jack7;

import java.util.ArrayList;
import java.util.List;

public class Player extends DeckofCards {

    String name;
    List<Card> playerCard = new ArrayList<Card>();
    Player(String name){
        this.name=name;

        for(int i =0; i < 5 ; i++){
            playerCard.add(dealCard());
        }
    }
    public void addCard(){
        playerCard.add(dealCard());
    }
    public void removeCard(Card ff){
        for (int a =0 ; a < playerCard.size(); a++){
            Card tmp = playerCard.get(a);
            if(tmp.compare(ff)==true){
                playerCard.remove(a);
                break;
            }
        }
    }
    public void showCard(){
        for(int i =0 ; i < playerCard.size();i++){
            System.out.println(playerCard.get(i));
        }
    }



}
