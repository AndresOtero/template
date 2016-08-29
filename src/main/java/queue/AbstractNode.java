package queue;

/**
 * Created by andres on 8/27/16.
 */
public abstract class AbstractNode<T> {
    AbstractNode<T> next;

    public T getData() {
        throw new AssertionError();
    }

    public AbstractNode getNext() {
        return next;
    }

    public abstract int size(int size);

    public AbstractNode setNext(AbstractNode nextNode) {
        return this.next = nextNode;
    }

}
