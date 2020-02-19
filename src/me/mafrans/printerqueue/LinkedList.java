package me.mafrans.printerqueue;

/**
 * Linked list to be used as a queue. Only needs addLast and removeFirst (enqueue and dequeue) together with
 * size() and isEmpty().
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class LinkedList {
    Node first;
    int size;

    /**
     * Constructor to create an empty list.
     */
    public LinkedList() {
        first = null;
        size = 0;
    }

    /**
     * Adds a new Node to the list. The Node is always added last. There's a special case when the list is empty
     * (first=null). Make sure to solve that properly...
     *
     * @param newNode
     */
    public void addLast(Node newNode) {
        size++;
        for(Node node = first; node != null; node = node.getNext()) {
            if(node.getNext() == null) {
                node.next = newNode;
                return;
            }
        }
        first = newNode;
    }

    /**
     * Removes and returns the first element of the list. Check if the list is empty and return null in that case
     * (bad practice, should throw an Exception)
     *
     * @return
     */
    public Node removeFirst() {
        Node n = first;
        first = first.getNext();
        size = Math.max(0, size - 1);

        return n;
    }

    /**
     * Return the size of the queue. Either implement as a loop calculating at each call (go through the nodes,
     * counting as you go OR use an internal variable (private int size) to continuously keep track of the queue-size).
     * Could be used by isEmpty...
     *
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * returns true if the queue is empty.
     *
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }

}