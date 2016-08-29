package queue;

/**
 * Created by andres on 8/27/16.
 */

public class Node<T> extends AbstractNode {
    T data;
    AbstractNode next = new LastNode<T>();

    public Node(T newData) {
        data = newData;
    }

    public T getData() {
        return data;
    }

    public AbstractNode getNext() {
        return next;
    }

    public AbstractNode setNext(AbstractNode nextNode) {
        return next = nextNode;
    }

    public int size(int size) {
        return next.size(size + 1);
    }
}
