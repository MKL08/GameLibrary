import java.util.ArrayList;
/**
 * Write a description of class Catalog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Catalog
{
    // instance variables - replace the example below with your own
    private ArrayList<String> games;
    private Game game;
    private String searchEngine;
    /**
     * Constructor for objects of class Catalog
     */
    public Catalog()
    {
        // initialise instance variables
        games = new ArrayList<String>();
        game = new Game();
        searchEngine = new String();
    }

    public void addGame(String gameName)
    {
        games.add(gameName);
    }
    
    public void removeGame(String gameName)
    {
        games.remove(gameName);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printListOfGames()
    {
        // put your code here
        for ( String game : games)
        {
            System.out.println();
        }
    }
    
    public void printGameSearched()
    {
        
    }
}
