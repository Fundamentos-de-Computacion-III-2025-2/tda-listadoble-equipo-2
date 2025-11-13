import javax.swing.*;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

    /*
    Pueden usar JOptionPane o hacer la interfaz por consola.
    Deben definir un menú con las siguientes opciones:
            "1. Insertar un elemento al inicio\n"+
            "2. Insertar un elemento al final\n"+
            "3. Insertar un elemento en orden\n"+
            "4. Eliminar un elemento al inicio\n"+
            "5. Eliminar un elemento al final\n"+
            "6. Eliminar un elemento\n"+
            "7. Buscar un elemento\n"+
            "8. Mostrar los datos de inicio a fin\n"+
            "9. Mostrar los datos de fin a inicio\n"+
            "10. Salir\n","Menú de opciones",3));
    */
    public static void main(String[] args) {

        int opcion = 0;
        int elemento;
        ListaDoble lista = new ListaDoble();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar un elemento al inicio\n" + //TODO @
                                "2. Insertar un elemento al final\n" + //TODO @
                                "3. Insertar un elemento en orden\n" + //TODO @
                                "4. Eliminar un elemento al inicio\n" + //TODO @
                                "5. Eliminar un elemento al final\n" + //TODO @
                                "6. Eliminar un elemento\n" + //TODO @
                                "7. Buscar un elemento\n" + //TODO @
                                "8. Mostrar los datos de inicio a fin\n" + //TODO @
                                "9. Mostrar los datos de fin a inicio\n" + //TODO @
                                "10. Salir\n",
                        "Menú de opciones", 3));
                switch (opcion) {
                    case 1://Insertar un elemento al inicio TODO @
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento: ",
                                    "Insertar al inicio: ", 3));
                            lista.insertarInicio(elemento);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage(), "Error de ingreso", 0);
                        }
                        break;
                    case 2://Insertar un elemento al final TODO @
                        break;
                    case 3: //Insertar en orden TODO @
                        break;
                     case 4: //Eliminar al inicio
                            int eliminadoInicio = lista.eliminarInicio();
                            if (eliminadoInicio == -1) {
                                JOptionPane.showMessageDialog(null, "La lista está vacía. No hay elementos para eliminar.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó el elemento al inicio: " + eliminadoInicio);
                            }
                            break;

                        case 5: //Eliminar al final
                            int eliminadoFinal = lista.eliminarFinal();
                            if (eliminadoFinal == -1) {
                                JOptionPane.showMessageDialog(null, "La lista está vacía. No hay elementos para eliminar.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó el elemento al final: " + eliminadoFinal);
                            }
                            break;
                      case 6: try {//eliminar un elemento cualquiera
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento: ",
                                    "Eliminar el elemento indicado: ", 3));
                            lista.eliminarElemento(elemento);
                            JOptionPane.showMessageDialog(null,"Se eliminó al elemento " + elemento,"Eliminar elemento ",1);

                        }catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null, "Error" + n.getMessage(), "Error de ingreso", 0);

                        }
                            break;
                        case 7: try {//buscar un elemento
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento a buscar: ",
                                    "Buscar elemento: ", 3));
                            if(lista.buscarElemento(elemento)){
                                JOptionPane.showMessageDialog(null,elemento+" encontrado en la lista","Elemento encontrado",1);
                            }else{
                                JOptionPane.showMessageDialog(null,elemento+" No encontrado en la lista","Elemento No encontrado",0);
                            }
                        }catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null,"Error"+n.getMessage(),"Error de ingreso",0);
                        }
                            break;
                    case 8: //MostrarLista TODO @
                        lista.mostrarInicioFin();
                        break;
                    case 9: //MostrarLista TODO @
                        lista.mostrarFinInicio();
                        break;
                    case 10: //Salir
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta");
           
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 10);
    }
}