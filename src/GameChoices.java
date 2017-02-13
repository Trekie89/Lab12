import java.awt.*;
import java.util.Scanner;

/**
 * Created by Samantha on 2/10/2017.
 */
public class GameChoices {

    //method to pick opponent
    public static String pickTeam() {

        Scanner scan1 = new Scanner(System.in);
        String userPick;

        System.out.println("Which person would you like to play against?");
        System.out.println("Sheldon or Leonard. Type 'Sheldon' or 'Leonard'");
        userPick = scan1.nextLine();

        return userPick;
    }

    //method that compares the choices to see who wins
    public static void getChoices(Roshambo userChoice, Roshambo computerChoice, String userName, String team) {

        if (userChoice == computerChoice) {
            //if there is a tie
            System.out.println("It's a tie!");
        }
        //this is if user picks rock
        if (userChoice == Roshambo.rock && computerChoice == Roshambo.paper) {
            System.out.println(team + " Wins!");
        }
        if (userChoice == Roshambo.rock && computerChoice == Roshambo.scissors) {
            System.out.println(userName + " Wins");
        }
        if (userChoice == Roshambo.rock && computerChoice == Roshambo.lizard) {
            System.out.println(userName + " Wins!");
        }
        if (userChoice == Roshambo.rock && computerChoice == Roshambo.spock) {
            System.out.println(team + " Wins");
        }

        //this is if user picks paper
        if (userChoice == Roshambo.paper && computerChoice == Roshambo.rock) {
            System.out.println(userName + " Wins!");
        }
        if (userChoice == Roshambo.paper && computerChoice == Roshambo.scissors) {
            System.out.println(team + " Wins");
        }
        if (userChoice == Roshambo.paper && computerChoice == Roshambo.lizard) {
            System.out.println(team + " Wins!");
        }
        if (userChoice == Roshambo.paper && computerChoice == Roshambo.spock) {
            System.out.println(userName + " Wins");
        }

        //if user picks scissors
        if (userChoice == Roshambo.scissors && computerChoice == Roshambo.rock) {
            System.out.println(team + " Wins!");
        }
        if (userChoice == Roshambo.scissors && computerChoice == Roshambo.paper) {
            System.out.println(userName + " Wins");
        }
        if (userChoice == Roshambo.scissors && computerChoice == Roshambo.lizard) {
            System.out.println(userName + " Wins!");
        }
        if (userChoice == Roshambo.scissors && computerChoice == Roshambo.spock) {
            System.out.println(team + " Wins");
        }

        //this is if user picks lizard
        if (userChoice == Roshambo.lizard && computerChoice == Roshambo.rock) {
            System.out.println(team + " Wins!");
        }
        if (userChoice == Roshambo.lizard && computerChoice == Roshambo.scissors) {
            System.out.println(team + " Wins");
        }
        if (userChoice == Roshambo.lizard && computerChoice == Roshambo.paper) {
            System.out.println(userName + " Wins!");
        }
        if (userChoice == Roshambo.lizard && computerChoice == Roshambo.spock) {
            System.out.println(userName + " Wins");
        }

        //this is if user picks spock
        if (userChoice == Roshambo.spock && computerChoice == Roshambo.rock) {
            System.out.println(userName + " Wins!");
        }
        if (userChoice == Roshambo.spock && computerChoice == Roshambo.scissors) {
            System.out.println(userName + " Wins");
        }
        if (userChoice == Roshambo.spock && computerChoice == Roshambo.paper) {
            System.out.println(team + " Wins!");
        }
        if (userChoice == Roshambo.spock && computerChoice == Roshambo.lizard) {
            System.out.println(team + " Wins");
        }

    }
}
