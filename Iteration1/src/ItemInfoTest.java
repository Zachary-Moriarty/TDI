import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author Bohdan Ivchenko
 */

public class ItemInfoTest {
    private ThingList TestList;
    private ArrayList<String> rooms;
    private ArrayList<String> types;

    @Before
    public void setUp(){
        rooms = new ArrayList<>();
        rooms.add("Room 1");
        rooms.add("Room 2");
        rooms.add("Room 3");

        types = new ArrayList<>();
        types.add("Type 1");
        types.add("Type 2");
        types.add("Type 3");


        TestList = new ThingList("Name","Password","Email", rooms, types );

        TestList.add(new Thing("TestThing1","Room 1","Type 3","Description of Thing 1"));

        TestList.add(new Thing("TestThing2","Room 2","Type 2","Description of Thing 2"));

        TestList.add(new Thing("TestThing3","Room 3","Type 1","Description of Thing 3"));

    }

    @Test
    public void testItemInfo(){
        ItemInfo test = new ItemInfo(new Thing("Name","Room","Type","Description"),TestList,new MainPageGUI("test","password","email"));
        Assert.assertNotNull(test);
    }
}
