/**
 * Created by Samantha on 2/10/2017.
 */
public class Leonard extends Player {


    @Override //overriding player method, leonard picks from all 5 choices
    public Roshambo getSelection() {

        int number;
        Roshambo result;

        number = (int) (Math.random() * 5 + 1);

        if (number == 1) {
            result = Roshambo.paper;
        }
        else if (number == 2) {
            result = Roshambo.rock;
        }
        else if (number == 3) {
            result = Roshambo.scissors;
        }
        else if (number == 4) {
            result = Roshambo.lizard;
        }
        else {
            result = Roshambo.spock;
        }

        return result;
    }
}
