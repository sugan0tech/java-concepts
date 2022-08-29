package ds.linear;

public class Node<T> implements java.io.Serializable {
    private T value;
    private Node<T> next = null;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public boolean equals(Node<T> node) {
        return this.value == node.value;
    }

}
