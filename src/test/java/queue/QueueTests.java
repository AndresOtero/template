package queue;

import org.junit.Test;

import java.lang.Integer;

import java.lang.Object;


import static org.junit.Assert.*;

/**
 * Created by andres on 8/27/16.
 */


public class QueueTests {

    public Queue<Integer> queueWithAnInteger() {
        Queue<Integer> queue = new Queue<Integer>();
        Integer int1 = new Integer(2);
        queue.add(int1);
        return queue;
    }

    @Test
    public void queueIsEmpty() {
        Queue<Integer> queue = new Queue<Integer>();
        assertTrue(queue.isEmpty());
        Integer int1 = new Integer(2);
        queue.add(int1);
        assertFalse(queue.isEmpty());

    }

    @Test
    public void queueStoresCorrectly() {
        Queue<Integer> queue = queueWithAnInteger();
        Integer int1 = queue.top();
        assertTrue(int1.intValue() == 2);
    }

    @Test
    public void queueRemovesCorrectly() {
        Queue<Integer> queue = queueWithAnInteger();
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test(expected = AssertionError.class)
    public void emptyQueueRemovesAssertionError() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    public void notEmptyQueueRemovesAssertionError() {
        Queue<Integer> queue = queueWithAnInteger();
        assertFalse(queue.isEmpty());
        queue.remove();
        assertTrue(queue.isEmpty());
        queue.remove();
    }

    @Test(expected = AssertionError.class)
    public void emptyQueueTopAssertionError() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.top();
    }

    @Test(expected = AssertionError.class)
    public void notEmptyQueueTopAssertionError() {
        Queue<Integer> queue = queueWithAnInteger();
        assertFalse(queue.isEmpty());
        queue.top();
        assertTrue(queue.isEmpty());
        queue.top();
    }
}


