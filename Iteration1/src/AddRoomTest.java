import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Bohdan Ivchenko
 */
public class AddRoomTest {
    @Test
    public void testAddRoom()
    {
        addRoom test = new addRoom();
        Assert.assertNotNull(test);
    }
}
