package DS.linear;

public class LinkedLst<T> implements Datt<T> {
    private int size = 0;

    private Node<T> head = null;

    public void add(T value) {
        Node<T> neww = new Node(value);
        size++;
        if (head == null) {
            head = neww;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(neww);
    };

    public T get(int index) {
        Node<T> temp = head;
        while (index > 0) {
            temp = temp.getNext();
            index--;
        }
        return temp.getValue();
    };

    public void delete(int index) {
        // will implement
    };

    public void deleteFirst(T value) {
        // will implement
    };

    public void deleteLast(T value) {
        // comming soon
    };

    public int size() {
        return this.size;
    };

    @Override
    public String toString() {
        String res = "{\n Head :";
        Node temp = head;
        while (temp.getNext() != null) {
            res += temp.getValue() + "->";
            temp = temp.getNext();
        }
        res += temp.getValue();

        res += "\n}\n";
        return res;
    }
}
