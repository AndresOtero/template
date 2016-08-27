package queue;

/**
 * Created by andres on 8/27/16.
 */

public class Node<T> extends AbstractNode {
    T data;

    public Node(T newData) {
        data = newData;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

}
