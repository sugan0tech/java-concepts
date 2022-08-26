package DS.linear;

public class Node<T> implements java.io.Serializable {
    private transient T value;
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

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
