
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    // instance variables - replace the example below with your own
    private Catalog catalog;
    private Subscription subscription;
    private String websiteName;
    /**
     * Constructor for objects of class Menu
     */
    public Menu()
    {
        // initialise instance variables
        catalog = new Catalog();
        subscription = new Subscription();
        websiteName = new String();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printWebsiteName()
    {
        // put your code here
        System.out.println("Game Library");
    }
    
}
