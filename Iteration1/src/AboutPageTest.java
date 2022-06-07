import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Bohdan Ivchenko
 */
public class AboutPageTest {
    @Test
    public void testAboutPage() {
        AboutPage test = new AboutPage("Name", "Email");
        Assert.assertNotNull(test);
    }

}

