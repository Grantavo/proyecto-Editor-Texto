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
    static Stack<String> pilasSecundaria = new Stack<>();
    //Texto actual del editor
    static String textoActual = "";

}
