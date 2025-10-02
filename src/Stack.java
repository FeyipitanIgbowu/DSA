import java.util.ArrayList;

public class Stack {

    private final ArrayList<Integer> elements = new ArrayList<>();


    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int sizeOfStack() {
        return elements.size();
    }

    public void addToStack(int item) {
        elements.add(item);
    }


    public void emptyStack() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
    }
    public int popStack() {
        this.emptyStack();
        return elements.remove(elements.size() - 1);
    }

    public int peekStack() {
        this.emptyStack();
        return elements.get(elements.size() - 1);
    }

    public void clearStack() {
        elements.clear();
    }
}
