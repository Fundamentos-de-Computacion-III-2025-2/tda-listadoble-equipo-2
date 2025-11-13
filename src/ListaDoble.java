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
//TODO para Melissa
    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){
//TODO para Melissa
    }


    //Eliminar al inicio
    public int eliminarInicio(){
        // Si la lista está vacía, no hay nada que eliminar
        if (listaVacia()) {
            return -1;
        }

        int elemento = inicio.dato; // Guardamos el dato a eliminar

        // Si solo hay un nodo en la lista
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            // Avanzamos el inicio al siguiente nodo
            inicio = inicio.siguiente;
            // Rompemos el enlace hacia atrás del nuevo inicio
            inicio.anterior = null;
        }
        return elemento; // Devolvemos el dato eliminado
    }


    //Eliminar al final
    public int eliminarFinal(){
        // Si la lista está vacía
        if (listaVacia()) {
            return -1;
        }

        int elemento = fin.dato; // Guardamos el dato del nodo a eliminar

        // Si solo hay un nodo en la lista
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            // Retrocedemos el fin al nodo anterior
            fin = fin.anterior;
            // Rompemos el enlace hacia adelante del nuevo fin
            fin.siguiente = null;
        }
        return elemento; // Devolvemos el dato eliminado
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