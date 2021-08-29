package DoubleLinkedList;

public class DoubleLinkedList<T> {
    public Node<T> start;
    public Node<T> end;
    
    public DoubleLinkedList() {
        start = new Node<T>();
        start.setPrev(start);
        end = start;
    }
}
