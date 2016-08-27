package queue;

import java.lang.Object;

/**
 * Created by andres on 8/27/16.
 */
public class NullNode<T> extends AbstractNode {
    public T getData() {
        throw new AssertionError();
    }

    public NullNode getNext() {
        throw new AssertionError();
    }



}
