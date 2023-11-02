package list;

import obj.Laptop;

public class Node {
    private Laptop data;
    private Node next;

    public Node() {

    }

    public Node(Laptop data) {
        this.data = data;
        this.next = null;
    }

    public Laptop getData() {
        return data;
    }

    public void setData(Laptop data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
