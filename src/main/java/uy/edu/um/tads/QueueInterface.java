package uy.edu.um.tads;

public interface QueueInterface<T>{
    void enqueue(T value);

    T dequeue() ;

    boolean contains(T value);

    T get(int i);

    int size();

    boolean isEmpty();
}
