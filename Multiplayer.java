import java.util.Scanner;

/**
 * Write a description of class Multiplayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplayer extends Game
{
    // instance variables - replace the example below with your own
    private String gameDescription;

    /**
     * Constructor for objects of class Multiplayer
     */
    public Multiplayer()
    {
        gameDescription = new String();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printGameDescription()
    {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Available games :" + Catalog.multiGames);
     System.out.println("Enter game name : ");
     String game = scanner.nextLine();
        switch(game){
            case "Minecraft":
                System.out.println("A sandbox game with no set goals, allowing players to explore, gather resources, craft items, and build structures in a procedurally generated 3D world made of blocks.");
                break;
            case "Genshin Impact":
                System.out.println("A free-to-play, open-world action RPG developed by HoYovertse that allows players to explore the vast fantasy world of Teyvat");
                break;
            case "Mario":
                System.out.println("Super Mario is a seminal side-scrolling platform video game series starring a mustachioed plumber named Mario.");
                break;
     }
     scanner.close();
    }
}
