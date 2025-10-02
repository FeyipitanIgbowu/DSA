import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestList {

    @Test
    void testAddToList() {
        List list = new List();
        list.addToList("Feyi");
        assertEquals("Feyi", list.getItemOnAnIndex(0));
    }

    @Test
    void testRemoveFromList() {
        List myList = new List();
        myList.addToList("Tiana");
        myList.removeFromList("Tiana");
        assertEquals(-1, myList.getItemIndex("Tiana"));
    }

    @Test
    void testGetItemIndex() {
        List myList = new List();
        myList.addToList("Feyi");
        assertEquals(0, myList.getItemIndex("Feyi"));
    }

    @Test
    void testGetItemOnAnIndex() {
        List myList = new List();
        myList.addToList("Tiana");
        myList.addToList("Feyi");
        assertEquals("Feyi", myList.getItemOnAnIndex(1));
    }
}
