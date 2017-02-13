import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        //Making a new game, and users
        GameChoices game1 = new GameChoices();
        Sheldon sheldon1 = new Sheldon();
        Leonard leonard1 = new Leonard();
        User user1 = new User();

        String userName;
        String team;

        //Welcome statement
        System.out.println("Welcome to the game Rock, Paper, Scissors, Lizard, Spock!");
        System.out.println("=========================================================");
        System.out.println();

        //having the user give their name and pick opponent
        userName = user1.getPlayerName();
        team = game1.pickTeam();

        //this determines which playGame method to run, depending on who they picked
        if (team.equalsIgnoreCase("Sheldon")) {
            playGame2(scan1, sheldon1, user1, game1, userName, team);

        }
        else if (team.equalsIgnoreCase("Leonard")) {
            playGame(scan1, leonard1, user1, game1, userName, team);

        }
        //thanking the user for playing
        System.out.println("Thanks for Playing, " + userName + "!");

    }

    //this is the method to play with leonard
    public static void playGame(Scanner scan1, Leonard leonard1, User user1, GameChoices game1, String userName, String team) {
        Roshambo userChoice;
        Roshambo computerChoice;
        String userContinue;
        do {
            //this gets the user choice and the computers choice
            userChoice = user1.getSelection();
            computerChoice = leonard1.getSelection();

            System.out.println("Leonard choose: " + computerChoice);

            //compares both choices
            game1.getChoices(userChoice, computerChoice, userName, team);

            System.out.println("Do you wish to play again? y/n");
            userContinue = scan1.nextLine();

        } while (userContinue.equalsIgnoreCase("y")); //continues until user wants to stop
    }

    //this is the method to play with sheldon
    public static void playGame2(Scanner scan1, Sheldon sheldon1, User user1, GameChoices game1, String userName, String team) {
        Roshambo userChoice;
        Roshambo computerChoice;
        String userContinue;
        do {
            //this gets the user choice and the computers choice
            userChoice = user1.getSelection();
            computerChoice = sheldon1.getSelection();
            System.out.println("Sheldon choose: " + computerChoice);

            //compares both choices
            game1.getChoices(userChoice, computerChoice, userName, team);

            System.out.println("Are you SURE you want to play again? y/n");
            userContinue = scan1.nextLine();

        }while (userContinue.equalsIgnoreCase("y")); //continues until user wants to stop
    }

}
