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
    public static ArrayList<String> singleGames;
    public static ArrayList<String> multiGames;
    public static ArrayList<String> games;
    private static Game game;
    private String searchEngine;
    /**
     * Constructor for objects of class Catalog
     */
    public Catalog()
    {
        // initialise instance variables
        singleGames = new ArrayList<String>();
        multiGames = new ArrayList<String> ();
        games = new ArrayList<String>();
        game = new Game();
        searchEngine = new String();
        
        games.add(new String("Genshin Impact"));
        games.add(new String("Mario"));
        games.add(new String("Zelda"));
        games.add(new String("Minecraft"));
        games.add(new String("Super Granny"));
        games.add(new String("Sudoku"));
        
        
        singleGames.add(new String("Super Granny"));
        singleGames.add(new String("Zelda"));
        singleGames.add(new String("Sudoku"));
        
        multiGames.add(new String("Genshin Impact"));
        multiGames.add(new String("Minecraft"));
        multiGames.add(new String("Mario"));
        
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
            System.out.println(game);
        }
    }
    
    public void printGameSearched(String input)
    {  
        for (String game : games){
        if (game.equals(input))
        {
            System.out.println(game);
            return;
        }
        }
        System.out.println("Sorry, the game you're trying to find is not available in our library.");

    }
}
