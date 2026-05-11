import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String gameName;
    private String gameCreator;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        gameName = new String();
        gameCreator = new String();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printGameName(String gameName)
    {
        // put your code here
        
    }

    public void printGameCreator()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available games :" + Catalog.games);
        System.out.println("Enter game name : ");
        String game = scanner.nextLine();
        switch(game){
            case "Minecraft":
                System.out.println("Creator : Markus Persson (Mojang)");
                break;
            case "Genshin Impact":
                System.out.println("Creators : Cai Haoyu, Liu Wei, and Luo Yuhao (miHoYo)");
                break;
            case "Mario":
                System.out.println("Creator : Shigeru Miyamoto (Nintendo)");
                break;
            case "Zelda":
                System.out.println("Creator : Shigeru Miyamoto (Nintentdo)");
                break;
            case "Super Granny":
                System.out.println("Creator :Dennis Vukanovic (Sandlot Games) ");
                break;
            case "Sudoku":
                System.out.println("Creator : Maki Kaji");
                break;
        }
        scanner.close();
    }
    
    public void printGameAgeRating()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available games for you :" + Catalog.games);
        System.out.println("Enter game name : ");
        String game = scanner.nextLine();
        switch(game){
            case "Minecraft":
                System.out.println(AgeRating.EVERYONE);
                break;
            case "Genshin Impact":
                System.out.println(AgeRating.TEEN);
                break;
            case "Mario":
                System.out.println(AgeRating.EVERYONE);
                break;
            case "Zelda":
                System.out.println(AgeRating.EVERYONE);
                break;
            case "Super Granny":
                System.out.println(AgeRating.TEEN);
                break;
            case "Sudoku":
                System.out.println(AgeRating.EVERYONE);
                break;
        }
        scanner.close();
    }

}
