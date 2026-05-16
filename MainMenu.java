
/**
 * Write a description of class MainMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainMenu
{
    // instance variables - replace the example below with your own

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

    public static void main(String[] args)
    {
        System.out.println("Game Library.com");

        Game game1 = new Game("Genshin Impact", "HoYoverse");
        Game game2 = new Game("Mario", "Nintendo");
        Game game3 = new Game("Zelda", "Nintendo");
        Game game4 = new Game("Minecraft", "Mojang");
        Game game5 = new Game("Super Granny", "Sandlot Games");
        Game game6 = new Game("Sudoku", "Unknown");

        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);
        System.out.println(game4);
        System.out.println(game5);
        System.out.println(game6);
    }
}