

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SubscriptionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SubscriptionTest
{
    /**
     * Default constructor for test class SubscriptionTest
     */
    public SubscriptionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        Subscription subscrip2 = new Subscription();
        subscrip2.addAccount("Water", "Bottle");
        subscrip2.logIn("Water", "Bottle");
        subscrip2.logOut("Water", "Bottle");
    }

    @Test
    public void logOutTest()
    {
        Subscription subscrip1 = new Subscription();
    }
}

