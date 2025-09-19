import java.util.Stack;

/**
 * Simulador de Editor de Texto Simple con funcionalidad Undo/Redo
 * Utiliza dos pilas para gestionar las acciones realizadas y deshechas

 * Integrante 1: Yenni Vanessa Delgado - Implementación de pilas y funciones básicas
 * Integrante 2: Gustavo Adolfo Merchancano Piedrahita - Implementación de funcionalidad Undo/Redo y menú
 */

public class EditorTextoSimple {

    // Variables globales y funciones básicas utilizando la clase stack de java

    //Pila principal para guardar las acciones realizadas
    static Stack<String> pilaPrincipal = new Stack<>();
    //Pila secundaria para guardar las acciones desechas
    static Stack<String> pilaSecundaria = new Stack<>();
    //Texto actual del editor
    static String textoActual = "";

    /**
     * Función para escribir texto
     * Implementado por : Yenni Vanessa Delgado
     */

    public static void escribirTexto(String nuevoTexto) {
        // Guardar el estado actual en la pila principal
        pilaPrincipal.push(textoActual);

        // Actualizar el texto actual
        if (textoActual.isEmpty()) {
            textoActual = nuevoTexto;
        } else {
            textoActual += "\n" + nuevoTexto;
        }

        //  Limpiar la pila secundaria al realizar nueva acción
        pilaSecundaria.clear();

        System.out.println("Texto agregado correctamente.");
    }

    /**
     * Función para mostrar el texto actual (equivalente a peek)
     * Implementado por: Integrante 1
     */
    public static void mostrarTextoActual() {
        if (textoActual.isEmpty()) {
            System.out.println("El editor está vacío.");
        } else {
            System.out.println("Texto actual:");
            System.out.println("================");
            System.out.println(textoActual);
            System.out.println("================");
        }
    }




}
