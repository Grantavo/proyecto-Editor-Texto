import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implementación manual de una estructura de datos de Pila (Stack).
 * Utiliza un ArrayList para almacenar los elementos de forma dinámica.
 * Según consulte, esta clase es genérica (<T>), por lo que puede almacenar cualquier tipo de objeto.
 */
public class PilaManual<T> {

    // Usamos un ArrayList para guardar los elementos de la pila.
    // Lo entendí como si fuese una "estantería" donde se apilan nuestros platos.
    private ArrayList<T> elementos;

    /**
     * Constructor para inicializar la pila.
     * Cuando creamos una PilaManual, la lista de elementos empieza vacía.
     */
    public PilaManual() {
        elementos = new ArrayList<>();
    }

    /**
     * Operación push(): Agrega un elemento en la cima de la pila.
     * @param elemento El elemento a agregar.
     */
    public void push(T elemento) {
        elementos.add(elemento);
    }

    /**
     * Operación pop(): Elimina y devuelve el elemento en la cima de la pila.
     * @return El elemento que estaba en la cima.
     * @throws EmptyStackException si la pila está vacía.
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // El último elemento del ArrayList es la cima de nuestra pila.
        return elementos.remove(elementos.size() - 1);
    }

    /**
     * Operación peek(): Devuelve el elemento en la cima sin eliminarlo.
     * @return El elemento en la cima.
     * @throws EmptyStackException si la pila está vacía.
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // Obtenemos el último elemento sin borrarlo.
        return elementos.get(elementos.size() - 1);
    }

    /**
     * Operación isEmpty(): Verifica si la pila no tiene elementos.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    /**
     * Limpia todos los elementos de la pila.
     * Es necesario para la función de rehacer (redo).
     */
    public void clear() {
        elementos.clear();
    }
}