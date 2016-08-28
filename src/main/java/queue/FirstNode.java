package queue;

/**
 * Created by andres on 8/27/16.
 */
public class FirstNode<T> extends AbstractNode {


    public int size(int size) {
        return next.size(size);
    }


}
