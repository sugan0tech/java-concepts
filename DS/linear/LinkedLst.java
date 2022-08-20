package DS.linear;

public class LinkedLst implements Datt {
    private int size = 0;

    private Node head = null;

    public void add(int value) {
        Node neww = new Node(value);
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

    public int get(int index) {
        Node temp = head;
        while (index > 0) {
            temp = temp.getNext();
            index--;
        }
        return temp.getValue();
    };

    public void delete(int index) {
        // will implement
    };

    public void deleteFirst(int value) {
        // will implement
    };

    public void deleteLast(int value) {
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
