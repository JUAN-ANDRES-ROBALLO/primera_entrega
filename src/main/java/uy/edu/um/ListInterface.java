package uy.edu.um;

public interface ListInterface<T>{
    public void add(T value);

    public void addToBeginning(T value);

    public T get(int position) throws IndexOutOfBoundsException;

    public boolean contains(T value);

    public void remove(T value);

    public int size();

    public listNode<T> getFirst();
}


