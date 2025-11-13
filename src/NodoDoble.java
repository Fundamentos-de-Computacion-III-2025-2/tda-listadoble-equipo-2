public class NodoDoble {

    public int dato;  //campo de información
    public NodoDoble siguiente;  //Apuntador al nodo siguiente
    public NodoDoble anterior; //Apuntador al nodo anterior

    //Constructor para cuando la lista está vacía
    public NodoDoble(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    //Constructor para cuando la lista no está vacía
    public NodoDoble(int dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

}
