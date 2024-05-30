package uy.edu.um.tads;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class listNode <T>{
    private T value;
    private listNode<T> next;

    public listNode(T value)
    {
        this.value = value;
    }
}
