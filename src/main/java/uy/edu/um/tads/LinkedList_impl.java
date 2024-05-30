package uy.edu.um.tads;

public class LinkedList_impl <T> implements ListInterface<T> {
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
        boolean contains = false;
        listNode<T> temp = this.first;

        while (temp != null && !temp.getValue().equals(value)) {

            temp = temp.getNext();

        }

        if (temp != null) { // Si no se llego al final de la lista, se encontro el valor

            contains = true;

        }

        return contains;
    }

    @Override
    public void remove(T value) {
        listNode<T> beforeSearchValue = null;
        listNode<T> searchValue = this.first;

        // Busco el elemento a eliminar teniendo en cuenta mantener una referencia al elemento anterior
        while (searchValue != null && !searchValue.getValue().equals(value)) {

            beforeSearchValue = searchValue;
            searchValue = searchValue.getNext();

        }

        if (searchValue != null) { // si encontre el elemento a eliminar

            // Verifico si es el primer valor (caso borde) y no es el ultimo
            if (searchValue == this.first && searchValue != this.last) {

                listNode<T> temp = this.first;
                this.first = this.first.getNext(); // salteo el primero

                temp.setNext(null); // quito referencia del elemento eliminado al siguiente.

                // Verifico si es el primer valor (caso borde) y no el primero
            } else if (searchValue == this.last && searchValue != this.first) {

                beforeSearchValue.setNext(null);
                this.last = beforeSearchValue;

                // Si es el primer valor y el ultimo (lista de un solo valor)
            } else if (searchValue == this.last && searchValue == this.first) {

                this.first = null;
                this.last = null;

            } else { // resto de los casos

                beforeSearchValue.setNext(searchValue.getNext());
                searchValue.setNext(null);

            }

        } else {

            // Si no es encuentra el valor a eliminar no se realiza nada

        }


    }

    @Override
    public int size() {
        int size = 0;

        listNode<T> temp = this.first;

        while (temp != null) {

            temp = temp.getNext();
            size++;

        }

        return size;
    }

    @Override
    public listNode<T> getFirst() {
        return this.getFirst();
    }

    @Override
    public boolean isEmpty() {
        int s = size();
        if (s == 0)
            return true;
        return false;

    }

    public void setValue(int position, T val) {
        listNode<T> temp = this.first;
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();


        }
        temp.setValue(val);

    }

    public void removeNode(int position) {

        listNode<T> temp = this.first;
        if(position==0)
            this.first=temp.getNext();
        else {
            listNode<T> temp1 = null;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();

            }
            temp1 = temp.getNext().getNext();
            temp.setNext(temp1);
        }
    }
    public void printList(){
        listNode<T> temp = this.first;
        System.out.print("[");
        while (temp != null) {
            if (temp.getNext()!=null)
                System.out.print(STR."\{temp.getValue()}"+" , ");
            else
                System.out.print(STR."\{temp.getValue()}");
            temp = temp.getNext();

        }
        System.out.print("]\n");
    }
}

