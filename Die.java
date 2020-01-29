
/**
 * Write a description of class Die here.
 *
 * @author Megan Kelleher
 * @version 2020-01-22
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int die;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        die = roll();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int roll()
    {
        // put your code here
        die = (int)(Math.random() * 6 +1);
        return die; 
    }
    
    public int getResult()
    {
        return die;
    }
}
