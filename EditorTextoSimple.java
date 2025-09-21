import java.util.Scanner;
// No usaremos la Pila que viene con Java (java.util.Stack).
// En su lugar, usaremos la nuestra.

public class EditorTextoSimple {

    // Aquí es donde cambiaremos "Stack", ahora dice "PilaManual"
    static PilaManual<String> pilaPrincipal = new PilaManual<>();
    static PilaManual<String> pilaSecundaria = new PilaManual<>();

    // El resto del código de Yenny lo dejé EXACTAMENTE IGUAL.
    static String textoActual = "";

    /**
     * Función para escribir texto
     * Implementado por: Yenni Vanessa Delgado
     */
    public static void escribirTexto(String nuevoTexto) {
        pilaPrincipal.push(textoActual);

        if (textoActual.isEmpty()) {
            textoActual = nuevoTexto;
        } else {
            textoActual += "\n" + nuevoTexto;
        }
        
        // Nuestra PilaManual necesita el método clear() para esto.
        pilaSecundaria.clear();

        System.out.println("Texto agregado correctamente.");
    }

    /**
     * Función para mostrar el texto actual
     * Implementado por: Yenni Vanessa Delgado
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

    /**
     * Función para deshacer la última acción (Undo)
     * Implementado por: Gustavo Adolfo Merchancano Piedrahita
     */
    public static void deshacer() {
        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay acciones para deshacer.");
            return;
        }
        pilaSecundaria.push(textoActual);
        textoActual = pilaPrincipal.pop();
        System.out.println("Acción deshecha correctamente.");
    }

    /**
     * Función para rehacer la última acción deshecha (Redo)
     * Implementado por: Gustavo Adolfo Merchancano Piedrahita
     */
    public static void rehacer() {
        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay acciones para rehacer.");
            return;
        }
        pilaPrincipal.push(textoActual);
        textoActual = pilaSecundaria.pop();
        System.out.println("Acción rehecha correctamente.");
    }

    /**
     * Función para mostrar el menú
     */
    public static void mostrarMenu() {
        System.out.println("\n===== EDITOR DE TEXTO SIMPLE =====");
        System.out.println("1. Escribir texto");
        System.out.println("2. Deshacer (Undo)");
        System.out.println("3. Rehacer (Redo)");
        System.out.println("4. Mostrar texto actual");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    /**
     * Función principal
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("¡Bienvenido al Editor de Texto Simple con Undo/Redo!");
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el texto a escribir: ");
                    String texto = scanner.nextLine();
                    escribirTexto(texto);
                    break;
                case 2:
                    deshacer();
                    break;
                case 3:
                    rehacer();
                    break;
                case 4:
                    mostrarTextoActual();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el Editor de Texto Simple!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}