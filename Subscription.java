import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.lang.*;
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
        if (accounts.containsKey(accountName)&& accounts.get(accountName).equals(accountPassword))
        {
            System.out.println("Welcome back " + accountName + "!");
        }
        else
        {
            System.out.println("Incorrect username or password. Please try again.");
        }
    }
    
    public boolean hasAccount(String accountName)
    {
      if(accounts.containsKey(accountName))
      {
          return true;
      }
      else
      {
          return false;
      }
    }
    
    public void logOut(String accountName, String accountPassword)
    {
        if (hasAccount(accountName) == true)
        {
            System.out.println("You have logged out.");
        }
        else if(hasAccount(accountName)== false)
        {
            System.out.println("You do not have an account to log out from.");
        }
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