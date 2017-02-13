import java.util.Scanner;

/**
 * Created by Samantha on 2/10/2017.
 */
public class Sheldon extends Player{

    @Override //overriding the player method, sheldon only returns rock
    public Roshambo getSelection() {

        return Roshambo.rock;
    }


}
