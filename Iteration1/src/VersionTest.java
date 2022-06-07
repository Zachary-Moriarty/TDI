import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
public class VersionTest {

    @Test
    public void testGetVersion() {

        Assert.assertEquals(Version.getVersion(),"version 1.0");
    }
}