package me.mafrans.printerqueue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This is a TEST
 * Created 2020-02-19
 *
 * @author Magnus Silverdal
 */
public class QueueTest {
    @Test
    public void shouldBeAbleToCreateQueue() {
        new Queue();
    }

    @Test
    public void createdQueueShouldBeEmpty() {
        Queue q = new Queue();
        assertEquals(true, q.isEmpty());
    }

    @Test
    public void createdQueueShouldHaveSizeZero() {
        Queue q = new Queue();
        assertEquals(0, q.size());
    }

    @Test
    public void enqueueShouldWork() {
        Queue q = new Queue();
        q.enqueue("Test");
    }

    @Test
    public void enqueueShouldIncreaseSize() {
        Queue q = new Queue();
        q.enqueue("Test");
        q.enqueue("Another test");
        assertEquals(2,q.size());
    }

    @Test
    public void dequeueShouldWork() {
        Queue q = new Queue();
        q.enqueue("Test");
        q.dequeue();
    }

    @Test
    public void dequeueShouldDecreaseSize() {
        Queue q = new Queue();
        q.enqueue("Test");
        q.enqueue("Another test");
        q.dequeue();
        assertEquals(1,q.size());
    }

    @Test
    public void dequeueShouldReturnTheDataFirstEnqueued() {
        Queue q = new Queue();
        q.enqueue("Test");
        q.enqueue("Another test");
        assertEquals("Test",q.dequeue());
    }
}