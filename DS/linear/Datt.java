package DS.linear;

public interface Datt<T> {
    public void add(T value);

    public T get(int index);

    public void delete(int index);

    public void deleteFirst(T value);

    public void deleteLast(T value);

    public int size();

}
