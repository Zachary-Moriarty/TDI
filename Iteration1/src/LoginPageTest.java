import junit.framework.Assert;
import org.junit.Test;


/**
 * @author Bohdan Ivchenko
 */

public class LoginPageTest {
    @Test
    public void testLoginPage(){
        LoginPage test = new LoginPage();
        Assert.assertNotNull(test);
    }
}
