package ds.linear;

public interface Datt<T> {
    public void add(T value);

    public T get(int index);

    public void delete(int index);

    public void deleteFirst();

    public void deleteLast();

    public int size();

    public boolean equals(Object obj);

}
