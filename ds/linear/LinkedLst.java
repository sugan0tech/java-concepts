package ds.linear;

public class LinkedLst<T> implements Datt<T>, java.io.Serializable {
    private int size = 0;

    private Node<T> head = null;

    public void add(T value) {
        Node<T> neww = new Node<>(value);
        size++;
        if (head == null) {
            head = neww;
            return;
        }
        Node<T> temp = head;
        while (temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(neww);
    };

    private Node<T> getHead() {
        return this.head;
    }

    public T get(int index) {
        Node<T> temp = head;
        while (index > 0) {
            temp = temp.getNext();
            index--;
        }
        return temp.getValue();
    }

    public void delete(int index) {
        Node<T> temp = this.head;
        while (--index > 0) {
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
    }

    public void deleteFirst() {
        this.head = this.head.getNext();
    }

    public void deleteLast() {
        Node<T> temp = this.head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
    }

    public int size() {
        return this.size;
    }

    public boolean equals(LinkedLst<T> lst) {
        if (this.size() == lst.size()) {
            Node<T> temp = this.head;
            Node<T> ref = lst.getHead();
            while (temp.hasNext()) {
                if (!temp.equals(ref)) {
                    return false;
                }
                temp = temp.getNext();
                ref = ref.getNext();
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String res = "{ Head :";
        Node<T> temp = head;
        while (temp.getNext() != null) {
            res += temp.getValue() + "->";
            temp = temp.getNext();
        }
        res += temp.getValue();

        res += " }\n";
        return res;
    }
}
