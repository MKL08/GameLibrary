
/**
 * Write a description of class MainMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainMenu
{
    // instance variables - replace the example below with your own
    private static void main(String[] args)
    {
        System.out.println("Game Library.com");
        
        Game game1 = new Game("Genshin Impact");
        Game game2 = new Game("Mario");
        Game game3 = new Game("Zelda");
        Game game4 = new Game("Minecraft");
        Game game5 = new Game("Super Granny");
        Game game6 = new Game("Sudoku");
        
        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);
        System.out.println(game4);
        System.out.println(game5);
        System.out.println(game6);
    }

    /**
     * Constructor for objects of class MainMenu
     */
    public MainMenu()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        // put your code here
    }
}