package me.mafrans.printerqueue;

/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue extends LinkedList {
    public void enqueue(String text) {
        this.addLast(new Node(text));
    }

    public String dequeue() {
        return this.removeFirst().getData();
    }
}