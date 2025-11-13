public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }


    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato) {
//TODO para Axel
        if (listaVacia()) {
            inicio = new NodoDoble(dato);
            fin = inicio;
        } else {
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.anterior = nuevo;
            inicio = nuevo;
        }
    }


    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato) {
//TODO para Melissa
    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato) {
//TODO para Melissa
    }


    //Eliminar al inicio
    public int eliminarInicio() {
//TODO para Hector
        return -1;
    }

    //Eliminar al final
    public int eliminarFinal() {
//TODO para Hector
        return -1;
    }

    //Eliminar un elemento
    public int eliminarElemento(int dato){
          int  elemento = -1;
            if(!listaVacia()){//mientras la lista NO esté vacía hacer...

                // si el dato está al inicio , llamo directamente el metod de eliminar inicio
                if(inicio.dato == dato){
                    return eliminarInicio();
                }

                // si el dato está al final ,llamo directamente el metdo de eliminar final
                if(fin.dato == dato){
                    return eliminarFinal();
                }
                // si no está ni al inicio ni al final, buscamos entre medio
                // ejemplo: lista 11,12,13,14 y quiero eliminar 13
                NodoDoble actual = inicio.siguiente; //empiezo desde el segundo nodo (12)

                // recorremos hasta encontrar el dato, mientras haya que comparar y mientras el dato actual sea distinto del que busco
                while(actual != null && actual.dato != dato){
                    actual = actual.siguiente;//avanza al siguiente (actualiza el dato , primero 12, luego actualiza a 13)
                }

                // si lo encontró (cuando actual ya es igual al dato a eliminar)
                if(actual != null){
                    elemento = actual.dato;// guardo el dato del nodo encontrado (13)

                    // reconecto los enlaces para saltar ese nodo
                    actual.anterior.siguiente = actual.siguiente;// nodo anterior ahora apunta al nodo después, 12.siguiente = 13.siguiente(14)
                    actual.siguiente.anterior = actual.anterior;// nodo siguiente ahora apunta al nodo anterior, 14.anterior = 13.anterior(12)

                }
            }

            return elemento;//retorno el valor eliminado
        }


    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){

            NodoDoble actual = inicio;
            while (actual != null) {
                if (actual.dato==(elemento)) {
                }
                actual = actual.siguiente; // Avanza hacia adelante
            }
            return false;
        }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin() {
        NodoDoble actual = inicio;
        System.out.println();
        while (actual != null) {
            System.out.print(actual.dato + " --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio() {
//TODO para Axel
        NodoDoble actual = fin;
        System.out.println();
        while (actual != null) {
            System.out.print(actual.dato + " --> ");
            actual = actual.anterior;
        }
    }
}


