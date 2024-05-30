package uy.edu.um;

import uy.edu.um.tads.InvalidArgumentException;
import uy.edu.um.tads.LinkedList_impl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList_impl<Integer> lista = new LinkedList_impl<>();
try {
    lista.add(3);
    lista.add(8);
    lista.add(10);

    lista.setValue(2,1);
    lista.removeNode(2);
    lista.removeNode(0);
    lista.printList();

}
catch (InvalidArgumentException e) {
    throw new RuntimeException(e);
}


    }
}