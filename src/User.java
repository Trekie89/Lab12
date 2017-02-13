import java.util.Scanner;

/**
 * Created by Samantha on 2/10/2017.
 */
public class User extends Player{

    @Override // overriding the player method to have user pick their own choice
    public Roshambo getSelection() {

        Scanner scan1 = new Scanner(System.in);
        String userInput;

        System.out.println("Would you like to choose Rock, Paper, Scissors, Lizard, or Spock?");
        userInput = scan1.nextLine();

        return Roshambo.valueOf(userInput.toLowerCase());// makes the user input to lower case to check with Roshambo
    }

    //getting the player name to personalize the game
    public String getPlayerName() {

        Scanner scan1 = new Scanner(System.in);
        String userName;

        System.out.println("What is your name?");
        userName = scan1.nextLine();

        return userName;

    }
}
