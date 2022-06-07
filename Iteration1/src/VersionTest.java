import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Bohdan Ivchenko
 */
public class VersionTest {

    @Test
    public void testGetVersion() {

        Assert.assertEquals(Version.getVersion(),"version 1.0");
    }
}