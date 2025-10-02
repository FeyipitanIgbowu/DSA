import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestStack {

    @Test
    public void testStackIsEmptyOnCreation() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatYouCanAddElementsToTheStack() {
        Stack stack = new Stack();
        stack.addToStack(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.peekStack());
    }


    @Test
    public void testThatYouCanPopElementFromStack() {
        Stack stack = new Stack();
        stack.addToStack(10);
        int response = stack.popStack();
        assertEquals(10, response);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatPeekDoesNotRemoveElement() {
        Stack stack = new Stack();
        stack.addToStack(20);
        int response = stack.peekStack();
        assertEquals(20, response);
        assertFalse(stack.isEmpty());
    }







}
