package ir.maktabsharif.q1;

public class Node <T>{
    public T element;
    public Node <T> next;
    public Node(T element) {
        this.element = element;
        this.next = null;
    }
}
