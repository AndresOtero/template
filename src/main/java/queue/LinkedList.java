package queue;

/**
 * Created by andres on 8/27/16.
 */
public class LinkedList<T> {
    AbstractNode<T> first = new FirstNode<T>();
    AbstractNode<T> last = first;

    public LinkedList() {
        last.setNext(new LastNode<T>());
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    int getSize() {
        return first.size(0);
    }

    public T top() {
        return last.getData();
    }

    void add(T item) {
        last = last.setNext(new Node<T>(item));
    }

    void remove() {
        first.setNext(first.getNext().getNext());
    }
}
