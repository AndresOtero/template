package queue;

/**
 * Created by andres on 8/27/16.
 */
public class LinkedList<T> {
    AbstractNode<T> first = new NullNode();
    AbstractNode<T> last;
    int size = 0;

    public LinkedList() {
        last = first;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    int getSize() {
        return size;
    }

    void add(T item) {
        Node<T> node = new Node<T>(item);
        last.setNext(node);
        last = node;
        size += 1;
    }

    void remove() {
        last = last.getNext();
        size -= 1;
    }
}
