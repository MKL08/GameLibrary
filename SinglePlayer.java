import java.util.Scanner;

/**
 * Write a description of class SinglePlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SinglePlayer extends Game
{
    // instance variables - replace the example below with your own
    private String gameDescription;

    /**
     * Constructor for objects of class SinglePlayer
     */
    public SinglePlayer()
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
     System.out.println("Available games :" + Catalog.singleGames);
     System.out.println("Enter game name : ");
     String game = scanner.nextLine();
        switch(game){
            case "Super Granny":
                System.out.println("Players control an elderly woman who must navigate dangerous environments to rescue her lost cats.");
                break;
            case "Zelda":
                System.out.println("A courageous young adventurer named Link, who is tasked with rescuing Princess Zelda and defeating the evil villain Ganon (or Ganondorf) to prevent him from using a sacred relic called the Triforce to rule the world.");
                break;
            case "Sudoku":
                System.out.println(" The goal is to fill the grid so every row, column, and block contains all digits from 1 to 9 exactly once, utilizing logic rather than mathematical calculation.");
                break;
     }
     scanner.close();
    }
}
