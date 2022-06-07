import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Bohdan Ivchenko
 */

public class MainPageGUITest {

    @Test
    public void testMainPageGUI(){
        MainPageGUI test = new MainPageGUI("test","password","email");
        Assert.assertNotNull(test);
    }
}
