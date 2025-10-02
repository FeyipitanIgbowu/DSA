import java.util.ArrayList;

public class Queue {

    private ArrayList<Integer> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }


    public void addToQueue(int item) {
        elements.add(item);
    }

    public void emptyQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty");
        }
    }
    public int removeFromQueue() {
        this.emptyQueue();
        return elements.remove(0);
    }

    public int peekQueue() {
        this.emptyQueue();
        return elements.get(0);
    }

    public int sizeOfQueue() {
        return elements.size();
    }

    public void clearQueue() {
        elements.clear();
    }
}
