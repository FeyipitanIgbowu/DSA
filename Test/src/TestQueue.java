import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestQueue {

    @Test
    void testQueueIsEmptyOnCreation() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testAddToQueue() {
        Queue queue = new Queue();
        queue.addToQueue(2);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.sizeOfQueue());
        assertEquals(2, queue.peekQueue());
    }

    @Test
    void testRemoveFromQueue() {
        Queue queue = new Queue();
        queue.addToQueue(5);
        queue.addToQueue(6);
        int remove = queue.removeFromQueue();
        assertEquals(5, remove);
        assertEquals(1, queue.sizeOfQueue());
        assertEquals(6, queue.peekQueue());
    }

    @Test
    void testPeekQueueDoesNotRemoveElement() {
        Queue queue = new Queue();
        queue.addToQueue(10);
        int peeked = queue.peekQueue();
        assertEquals(10, peeked);
        assertEquals(1, queue.sizeOfQueue());
    }

    @Test
    void testClearQueue() {
        Queue queue = new Queue();
        queue.addToQueue(1);
        queue.addToQueue(2);
        queue.clearQueue();
        assertTrue(queue.isEmpty());
    }




}
