import junit.framework.Assert;
import org.junit.Test;

public class RegistrationSenderTest {
    @Test
    public void testRegistrationSender(){
        LoginPage login = new LoginPage();
        RegistrationSender test = new RegistrationSender(login);
        Assert.assertNotNull(test);
    }
}
