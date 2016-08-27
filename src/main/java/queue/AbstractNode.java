package queue;

/**
 * Created by andres on 8/27/16.
 */
public abstract class AbstractNode<T> {
    Node next;

    public abstract T getData();

    public abstract AbstractNode getNext();

    public void setNext(Node nextNode) {
        next = nextNode;
    }

}
