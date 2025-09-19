#  Editor de Texto Simple con Undo/Redo

## Comprensión Teórica: ¿Qué es una pila?

Una **pila** es una estructura de datos que sigue la regla **LIFO (Last In, First Out)**: el último elemento en entrar es el primero en salir.  
Un ejemplo claro es una pila de libros: el último que colocas es el primero que tomas.

Las operaciones más comunes son:
- **push()** → Agregar un elemento a la pila.
- **pop()** → Eliminar el último elemento agregado.
- **peek()** → Ver el último elemento sin eliminarlo.
- **isEmpty()** → Verificar si la pila está vacía.  

### Aplicación en Undo/Redo
En este proyecto se usan **dos pilas**:
- `pilaPrincipal`: guarda el historial de estados anteriores del texto.
- `pilaSecundaria`: almacena los textos que se deshicieron para poder rehacerlos.

De esta forma:
1. Cuando se escribe, el estado anterior se guarda en `pilaPrincipal`.
2. Al usar **Undo**, el estado actual pasa a `pilaSecundaria` y se recupera el anterior de `pilaPrincipal`.
3. Con **Redo**, se restaura el último estado guardado en `pilaSecundaria`.  

##  Presentación del Proyecto

El programa es un **Editor de Texto Simple en Java** que permite:
- Escribir texto.
- Mostrar el texto actual.
- Deshacer (Undo).
- Rehacer (Redo).
- Salir del programa con un menú interactivo.

---


## Evidencia de Ejecución (Funciones Principales y Operaciones de Pila)

### Funciones de la integrante Yenni Vanessa Delgado
Encargada de las **pilas y funciones básicas**:

- **push() → Agregar un elemento a la pila**  
  *(Captura escribiendo varias frases para mostrar cómo se guarda el estado anterior en la pila principal)*

- **peek() → Ver el último elemento sin eliminarlo**  
  *(Captura mostrando el texto actual después de escribir, equivalente a consultar la cima de la pila)*

---

### Funciones del Integrante Gustavo Adolfo 
Encargado de la **funcionalidad Undo/Redo y el menú**:

- **pop() → Eliminar el último elemento agregado**  
  *(Captura después de aplicar Undo, evidenciando cómo se recupera el texto anterior al sacar el último de la pila)*

- **isEmpty() → Verificar si la pila está vacía**  
  *(Captura intentando deshacer o rehacer cuando no hay acciones disponibles, mostrando el mensaje: “No hay acciones para deshacer/rehacer”)*

- **Uso del Menú interactivo**  
  *(Captura navegando por el menú y probando distintas opciones)*

---

## Autores

- **Integrante 1**: Yenni Vanessa Delgado – Implementación de pilas y funciones básicas.
- **Integrante 2**: Gustavo Adolfo Piedrahita – Implementación de Undo/Redo y menú interactivo.

---

## Conclusión

Este proyecto permite evidenciar cómo una **estructura de datos tipo pila** puede utilizarse para implementar acciones comunes en editores de texto como **Undo** y **Redo**.  
Cada función del programa (escribir, mostrar, deshacer, rehacer) refleja directamente las operaciones **push, pop, peek e isEmpty** de una pila, reforzando la teoría con la práctica.

## Instrucciones de ejecución

1. Clonar este repositorio:
   ```bash
   git clone https://github.com/yennivanessa97/editor-texto-undo-redo.git
