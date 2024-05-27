package uy.edu.um;

public interface ListInterface<T>{
    void add(T value);

    T get(int position);

    boolean contains(T value);

    void remove(T value);

    int size();

    listNode<T> getFirst();

    boolean isEmpty();
}


