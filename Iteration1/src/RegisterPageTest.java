import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Bohdan Ivchenko
 */

public class RegisterPageTest {

    @Test
    public void testRegisterPage() {
        LoginPage login = new LoginPage();
        RegisterPage test = new RegisterPage(login); //You have to interact to finnish test
        Assert.assertNotNull(test);

    }
}
