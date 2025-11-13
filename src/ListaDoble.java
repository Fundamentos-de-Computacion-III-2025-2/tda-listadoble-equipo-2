public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato){
//TODO para Axel

    }

    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato){

        NodoDoble nuevoNodo = new NodoDoble(dato);

        //Validar su la lista esta vacia
        if (listaVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }
        else {
            // El siguiente del nodo actual de 'fin' (el último) apunta al nuevo nodo
            fin.siguiente = nuevoNodo;

            // El anterior del nuevo nodo apunta al nodo actual de 'fin'
            nuevoNodo.anterior = fin;

            // Mover el puntero que esta en fin al nuevo nodo
            fin = nuevoNodo;
        }
    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){
        NodoDoble nuevoNodo = new NodoDoble(dato);

        //Validar que la lista este vacia
        if (listaVacia()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
            return;
        }

        if (dato <= inicio.dato) {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
            return;
        }

        NodoDoble actual = inicio;

        while (actual.siguiente != null && actual.siguiente.dato < dato) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            actual.siguiente = nuevoNodo;
            nuevoNodo.anterior = actual;
            fin = nuevoNodo; // Actualizar fin
        }

        else {
            NodoDoble siguiente = actual.siguiente;

            nuevoNodo.siguiente = siguiente;
            nuevoNodo.anterior = actual;

            actual.siguiente = nuevoNodo;
            siguiente.anterior = nuevoNodo;
        }
    }


    //Eliminar al inicio
    public int eliminarInicio(){
//TODO para Hector
        return -1;
    }

    //Eliminar al final
    public int eliminarFinal(){
//TODO para Hector
        return -1;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){
//TODO para Maria
        return elemento;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){
//TODO para Maria
        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio(){
//TODO para Axel
    }


}