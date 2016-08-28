package queue;

import java.lang.Object;

/**
 * Created by andres on 8/27/16.
 */
public class LastNode<T> extends AbstractNode {

    public LastNode getNext() {
        throw new AssertionError();
    }

    public int size(int size) {
        return size;
    }


}
