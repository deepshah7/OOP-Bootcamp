import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is a famous Java example by Joshua Bloch to highlight the pitfalls of inheritance
 */
public class CountingList {
    private int counter = 0;

    private MyStringList list = new MyStringList();

    public void add(String t) {
        list.add(t);
        counter ++;
    }

    public void addAll(Collection<String> c) {
        list.addAll(c);
        counter += c.size();
    }

    public int getCounter() {
        return counter;
    }

    public String toString() {
        return String.format("Added %d elements: %s", counter, list.concatenateList(", "));
    }
}
