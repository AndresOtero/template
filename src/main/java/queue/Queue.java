package queue;

/**
 * Created by andres on 8/27/16.
 */
public class Queue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.getSize();
    }

    void add(T item) {
        list.add(item);
    }

    void remove() {
        list.remove();
    }
}
