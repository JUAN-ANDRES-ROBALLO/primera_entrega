package uy.edu.um.tads;

public interface ListInterface<T>{
    void add(T value);

    T get(int position) throws InvalidArgumentException;

    boolean contains(T value);

    void remove(T value);

    int size();

    listNode<T> getFirst();

    boolean isEmpty();
}


