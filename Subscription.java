import java.util.HashMap;
import java.util.Map;
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
    public void printAccountInformation()
    {
        // put your code here
        System.out.println();
    }

    public void listAllAccounts()
    {
        for (Map.Entry<String, String> entry : accounts.entrySet())
        {
            System.out.println("Account name : " + entry.getKey() + " Account Password : " + entry.getValue());
        }
    }
}