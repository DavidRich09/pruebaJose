package pruebaJose;

import pruebaJose.lista_enlanzada;

public class Main {

    public static void main(String[] args) {

        lista_enlanzada lista = new lista_enlanzada();

        lista.añadirPrimero(1);
        lista.añadirFinal(2);
        lista.añadirFinal(3);
        lista.añadirFinal(4);
        lista.añadirFinal(5);
        lista.añadirFinal(6);


        lista.print();

        //System.out.println(lista.obtener(0));
        //System.out.println(lista.obtener(1));
        //System.out.println(lista.obtener(2));
        //System.out.println(lista.obtener(3));

    }
}
