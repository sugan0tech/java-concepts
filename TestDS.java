import ds.linear.*;

public class TestDS {
    public static void main(String args[]) {
        LinkedLst<Integer> lst = new LinkedLst<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.delete(2);
        lst.add(6);
        lst.deleteFirst();
        lst.deleteLast();

        System.out.println(lst);
    }
}