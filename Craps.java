
/**
 * Write a description of class Craps here.
 *
 * @author Megan Kelleher
 * @version 2020-01-22
 */
import java.util.Scanner; 
public class Craps
{
    public void giveInstructions(Scanner in)
    {
        System.out.println("Do you need instructions (y/n)?");
        String playGame = in.nextLine();
        if (playGame.equals("") || playGame.substring(0,1).equalsIgnoreCase("y"));
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        Die d1 = new Die();
        Die d2 = new Die();
        System.out.println("LET'S PLAY CRAPS!!");
        giveInstructions(in);
        boolean playing = true;
        while(playing) 
        {
            System.out.println("Press <Enter> to roll the dice...");
            in.nextLine(); 
            int firstRoll = d1.roll() + d2.roll();
            System.out.println("Your first roll is: " + d1.getResult() && d2.getResult());
            if (firstRoll == 7 || firstRoll == 11)
            {
                System.out.println("You win!Congrats!");
            }
            else if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12)
            {
                System.out.println("You lose!Bummer...");
            }
            else 
            {
                System.out.println("That's your point.");
            }
        }
    }
}
