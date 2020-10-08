package pruebaJose;

public class lista_enlanzada {

    Nodo cabeza;
    int size;

    public lista_enlanzada(){
        cabeza = null;
        size = 0;
    }

    public Object obtener(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador<index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public boolean estaVacia(){
        return cabeza == null;
    }

    public void añadirPrimero(Object obj){
        if (cabeza == null){
            cabeza = new Nodo(obj);
        } else{
            Nodo temporal = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temporal);
            cabeza = nuevo;
        }
        size++;
    }

    public void añadirFinal(Object obj){
        Nodo temporal = cabeza;
        Nodo nuevo = new Nodo(obj);
        nuevo.enlazarSiguiente(null);
        while (temporal.obtenerSiguiente() != null){
            temporal = temporal.obtenerSiguiente();
        }
        temporal.enlazarSiguiente(nuevo);
    }

    public Nodo eliminarPrimero(){
        if (cabeza != null){
            Nodo temporal = cabeza;
            cabeza = cabeza.obtenerSiguiente();
            size--;
            return temporal;
        } else {
            return null;
        }
    }

    public void cortar(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index-1){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(null);
        size=index;
    }

    public void eliminar(int index){
        if (index == 0){
            cabeza = cabeza.obtenerSiguiente();
        } else {
            int contador = 0;
            Nodo temporal = cabeza;
            while (contador<index-1){
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(cabeza.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }

    public int getSize(){
        return size;
    }

    public void print(){
        Nodo temporal = cabeza;
        while(temporal != null){
            System.out.println(temporal.obtenerValor());
            temporal = temporal.obtenerSiguiente();
        }
    }

}
