package me.mafrans.printerqueue;

/**
 * This is a class
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Node {
    String data;
    Node next;

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}