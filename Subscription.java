import java.util.HashMap;
import java.util.Map;
import java.util.*;
/**
 * Write a description of class Subscription here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Subscription
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> accounts;
    private String accountName;
    private String accountPassword;
    /**
     * Constructor for objects of class Subscription
     */
    public Subscription()
    {
        // initialise instance variables
        accounts = new HashMap<>();
        accountName = new String();
        accountPassword = new String();
    }

    public void addAccount(String accountName, String accountPassword)
    {
        accounts.put(accountName, accountPassword); 
    }

    public void removeAccount(String accountName, String accountPassword)
    {
        accounts.remove(accountName, accountPassword);
    }

    public void logIn(String accountName, String accountPassword)
    {
        if (accounts.equals(accountName)&& accounts.equals(accountPassword))
        {
            System.out.println("Welcomback" + accountName + "!");
        }
        else
        {
            System.out.println("Incorrect username or password. Please try again.");
        }

        // if (login successful) { System.out.println ("Login Successfull."); } else { code below }
        System.out.println("Wrong username or password. Please try again.");

    }

    public void logOut()
    {
        System.out.println("You have logged out.");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void listAllAccounts()
    {
        for (Map.Entry<String, String> entry : accounts.entrySet())
        {
            System.out.println("Account name : " + entry.getKey());
            System.out.println("Account Password : " + entry.getValue());
        }
    }
}