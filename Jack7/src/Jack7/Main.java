package Jack7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

    int numberofPlayers;
    Player[] allPlayers;

    @Override
    public void start(Stage primaryStage) throws IOException {
        // you need to show the primary stage
        Parent root = FXMLLoader.load(getClass().getResource("gameplay.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setResizable(false);
        primaryStage.show();
        // your code
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int number = scanner.nextInt();
        numberofPlayers=number;
        allPlayers = new Player[numberofPlayers];
        Scanner scn = new Scanner(System.in);
        for(int i =0;i < numberofPlayers;i++){
            System.out.println("Enter the name of the player : ");
            String name = scn.next();
            allPlayers[i] = new Player(name);
        }
        DeckofCards deckofCards = new DeckofCards();
    }

    public static void main(String[] args) {
	   launch(args);
    }
}
