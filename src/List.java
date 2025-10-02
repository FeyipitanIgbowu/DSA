import java.util.ArrayList;

public class List {
    private ArrayList<String> items = new ArrayList<>();

    public void addToList(String item) {
        items.add(item);
    }
    public void removeFromList(String item) {
        items.remove(item);
    }

    public int getItemIndex(String item) {
        return items.indexOf(item);
    }

    public String getItemOnAnIndex(int input) {
        return items.get(input);
    }


}
