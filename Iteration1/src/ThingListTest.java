import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


/**
 * @author Bohdan Ivchenko
 */
public class ThingListTest {

    private ThingList TestList;
    private ArrayList<String> rooms;
    private ArrayList<String> types;

    @Before
    public void setUp() {


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
    public void getRooms() {
        ArrayList<String> testRooms = TestList.getRooms();
        Assert.assertEquals(testRooms, rooms);
    }

    @Test
    public void getTypes() {
        ArrayList<String> testTypes = TestList.getTypes();
        Assert.assertEquals(testTypes, types);
    }

    @Test
    public void add() {
        Thing TestThing1 = new Thing("TestTestThing1","Room1","Type 1", "Description");

        ArrayList<Thing> TestThings = TestList.getThings();

        Assert.assertFalse(TestThings.contains(TestThing1));

        TestList.add(TestThing1);

        TestThings = TestList.getThings();

        Assert.assertTrue(TestThings.contains(TestThing1));

    }

    @Test
    public void addRoom() {

        ArrayList<String> TestRooms = TestList.getRooms();

        Assert.assertFalse(TestRooms.contains("Test Room 4"));

        TestList.addRoom("Test Room 4");

        TestRooms = TestList.getRooms();

        Assert.assertTrue(TestRooms.contains("Test Room 4"));
    }

    @Test
    public void addType() {
        ArrayList<String> TestTypes = TestList.getTypes();

        Assert.assertFalse(TestTypes.contains("Test Type 4"));

        TestList.addType("Test Type 4");

        TestTypes = TestList.getTypes();

        Assert.assertTrue(TestTypes.contains("Test Type 4"));
    }

    @Test
    public void sortByName() {
        TestList.sortByName();

        Assert.assertEquals(TestList.getThings().get(0).getName(),"TestThing1");
        Assert.assertEquals(TestList.getThings().get(1).getName(),"TestThing2");
        Assert.assertEquals(TestList.getThings().get(2).getName(),"TestThing3");
    }

    @Test
    public void sortByRoom() {
        TestList.sortByRoom();

        Assert.assertEquals(TestList.getThings().get(0).getRoom(),"Room 1");
        Assert.assertEquals(TestList.getThings().get(1).getRoom(),"Room 2");
        Assert.assertEquals(TestList.getThings().get(2).getRoom(),"Room 3");

    }

    @Test
    public void sortByType() {
        TestList.sortByType();

        Assert.assertEquals(TestList.getThings().get(0).getType(),"Type 1");
        Assert.assertEquals(TestList.getThings().get(1).getType(),"Type 2");
        Assert.assertEquals(TestList.getThings().get(2).getType(),"Type 3");
    }

    @Test
    public void getThings() {
        TestList.sortByName();
        ArrayList<Thing> TestThingArray = TestList.getThings();
        Assert.assertEquals(TestThingArray.get(0).getName(),"TestThing1");
    }

    @Test
    public void get2DArray() {
        TestList.sortByName();
        String[][] theArr = TestList.get2DArray();

        Assert.assertEquals(theArr[0][0],"TestThing1");
        Assert.assertEquals(theArr[2][1],"Room 3");
        Assert.assertEquals(theArr[1][2],"Type 2");
        Assert.assertEquals(theArr[2][0],"TestThing3");

    }

    @Test
    public void getThing() {
        TestList.sortByName();
        Assert.assertEquals(TestList.getThing("TestThing1").getType(),"Type 3");

    }

    @Test
    public void removeThing() {
        Thing TestThing1 = new Thing("TestThing3","Room 3","Type 1","Description of Thing 3");
        TestList.removeThing(TestThing1);
        Assert.assertFalse(TestList.getThings().contains(TestThing1));
    }
}