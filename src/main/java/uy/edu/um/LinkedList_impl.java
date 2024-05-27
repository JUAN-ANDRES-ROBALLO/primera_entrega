package uy.edu.um;
import lombok.Setter;
import lombok.Getter;
public class LinkedList_impl <T> implements ListInterface<T>{
    private listNode<T> first;

    private listNode<T> last;

    public void MyLinkedListImpl() {
        this.first = null;
        this.last = null;
    }
    @Override
    public void add(T value) {
        addToTheEnd(value);
    }
    private void addToTheEnd(T value) {
        if (value != null) {

            listNode<T> elementToAdd = new listNode<>(value);

            if (this.first == null) { // si la lista es vacia

                this.first = elementToAdd;
                this.last = elementToAdd;

            } else { // en caso de no ser vacia se agrega al final

                this.last.setNext(elementToAdd);
                this.last = elementToAdd;
            }

        } else {
            // si el elemento es vacio se ignora
        }
    }

    @Override
    public T get(int position) {
        T valueToReturn = null;
        int tempPosition = 0;
        listNode<T> temp = this.first;

        // Se busca el nodo que corresponde con la posicion
        while (temp != null && tempPosition != position) {

            temp = temp.getNext();
            tempPosition++;

        }

        // si se encontro la posicion se retorna el valor
        // en caso que se haya llegado al final y no se llego a la posicion se retorna null
        if (tempPosition == position) {


            valueToReturn = temp.getValue();

        }

        return valueToReturn;
    }


    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public void remove(T value) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public listNode<T> getFirst() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
