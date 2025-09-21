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
  ![ingresandoDatos](https://github.com/user-attachments/assets/71f4cdbc-84ea-449b-9455-4a228d2d5035)

- **peek() → Ver el último elemento sin eliminarlo**  
  ![consultaDatos](https://github.com/user-attachments/assets/909c8115-5e40-406f-8065-33b650a81cc4)

---

### Funciones del Integrante Gustavo Adolfo 
Encargado de la **funcionalidad Undo/Redo y el menú**:

- **pop() → Eliminar el último elemento agregado**  
![undo](https://github.com/user-attachments/assets/029d16d3-a418-4358-8603-aef901c1e84d)
![redo](https://github.com/user-attachments/assets/ae6701a7-e18e-439e-971b-b238e6418d14)

- **isEmpty() → Verificar si la pila está vacía**  
![pilaVacia](https://github.com/user-attachments/assets/e5dfd64d-078f-435b-8c3b-50d4910450cc)

- **Uso del Menú interactivo**  
![opciones](https://github.com/user-attachments/assets/8d7d107f-6d1e-46fa-834c-4b8724bd4513)

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
