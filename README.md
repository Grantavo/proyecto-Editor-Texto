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


- **push() → Agregar un elemento a la pila**  
  ![ingresandoDatos](https://github.com/user-attachments/assets/e6d1f519-88ef-40fd-b55d-707e0a4f0b11)


- **peek() → Ver el último elemento sin eliminarlo**  
![consultaDatos](https://github.com/user-attachments/assets/ad0de91a-94cb-431d-a98d-904fedb22643)

---

### Funcionalidad Undo/Redo y el menú**:

- **pop() → Eliminar el último elemento agregado**  
![redo](https://github.com/user-attachments/assets/352ae249-c761-422a-9e58-2a6df3f76b2e)
![undo](https://github.com/user-attachments/assets/188ecc0e-e02d-4852-8f17-8eac586ed99f)


- **isEmpty() → Verificar si la pila está vacía**  
![pilaVacia](https://github.com/user-attachments/assets/290f6b72-193d-4cb8-8c01-3490ac04241f)


- **Uso del Menú interactivo**  
![opciones](https://github.com/user-attachments/assets/91b05d24-719f-48d9-ba5b-45d6d92ee61d)

---

## Autores


- **Integrante**: Gustavo Adolfo Piedrahita 

---

## Conclusión

Este proyecto permite evidenciar cómo una **estructura de datos tipo pila** puede utilizarse para implementar acciones comunes en editores de texto como **Undo** y **Redo**.  
Cada función del programa (escribir, mostrar, deshacer, rehacer) refleja directamente las operaciones **push, pop, peek e isEmpty** de una pila, reforzando la teoría con la práctica.




