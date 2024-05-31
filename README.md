# Java Functional
La programación funcional fue introducida en Java con la versión Java 8, lanzada en marzo de 2014.
Añadió las siguientes características:
- Expresiones lambda: permiten definir funciones anónimas de una manera más compacta y concisa.
- API Streams: permite realizar operaciones de procesamiento de datos de una manera declarativa y funcional, como map, filter, reduce, etc.
- Optional: La clase Optional se utiliza para representar un valor que puede estar presente o no, y para evitar problemas con null.
- Interfaces Funcionales, Method References y Default Methods en Interfaces.

### ¿Qué es la programación funcional?
La programación funcional se enfoca en usar funciones puras y datos inmutables para crear programas más previsibles y manejables, permitiendo una mayor modularidad y facilitando el razonamiento sobre el código.

### Diferencia entre programación imperativa y declarativa

La programación imperativa se trata de decirle a la computadora cómo lograr un resultado, mientras que la programación declarativa se trata de decirle qué resultado se desea sin preocuparse tanto por los detalles del proceso.

#### Programación Imperativa
- Programación Orientada a Objetos.
#### Programación Declarativa
- Programación Funcional.

## Interfaces Funcionales
Una interfaz funcional es una interfaz con un único método abstracto, adecuado para el uso con lambdas.


Interfaces funcionales más comunes de usar del package [**java.util.function**](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html):
 
**Function<T, R>:**

- Descripción: Representa una función que acepta un argumento y produce un resultado.
- Método abstracto: R apply(T t)
- Para mapear o transformar valores en un stream.

**Predicate< T >:**

- Descripción: Representa una función que acepta un argumento y devuelve un valor booleano.
- Método abstracto: boolean test(T t)
- Para filtrar elementos en una colección o stream.

**Consumer < T >:**

- Descripción: Representa una operación que acepta un único argumento y no devuelve resultado.
- Método abstracto: void accept(T t)
- Para realizar operaciones sobre cada elemento de una colección o stream, como imprimir o modificar.

**Supplier <T>:**

- Descripción: Representa una función que no acepta argumentos y produce un resultado.
- Método abstracto: T get()
- Para generar o proporcionar valores bajo demanda, como crear nuevas instancias.

## Stream

La [**API Stream**](https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/util/stream/Stream.html) de Java proporciona un conjunto de operaciones que permiten procesar datos de forma declarativa y concisa.

Algunas funciones:

### filter:

- Propósito: Filtra elementos de un stream.
- Descripción: Toma un predicado (una condición booleana) y devuelve un nuevo stream que contiene solo los elementos que satisfacen esa condición.

### map:

- Propósito: Transforma elementos de un stream.
- Descripción: Toma una función que transforma un elemento en otro y devuelve un nuevo stream que contiene los elementos transformados.

### flatMap:

- Propósito: Aplana y transforma elementos.
- Descripción: Similar a map, pero cada elemento transformado puede producir múltiples elementos, que son aplanados en un único stream.

### sorted:

- Propósito: Ordena elementos de un stream.
- Descripción: Devuelve un nuevo stream con los elementos ordenados de acuerdo a un comparador proporcionado.

## distinct:

- Propósito: Elimina duplicados.
- Descripción: Devuelve un nuevo stream que contiene solo los elementos distintos (únicos) del stream original.

### limit:

- Propósito: Limita el tamaño del stream.
- Descripción: Devuelve un nuevo stream que contiene no más de un número especificado de elementos del stream original.

### skip:

- Propósito: Salta elementos.
- Descripción: Devuelve un nuevo stream que omite un número especificado de los primeros elementos.

### collect:

- Propósito: Acumula los elementos en una colección o una estructura de datos.
- Descripción: Toma un Collector y acumula los elementos del stream en una colección, lista, conjunto, mapa u otra estructura de datos.

### forEach:

- Propósito: Realiza una acción en cada elemento.
- Descripción: Toma un Consumer y aplica esa operación a cada elemento del stream. Principalmente se utiliza para operaciones finales como imprimir.

### reduce:

- Propósito: Combina elementos en un único valor.
- Descripción: Toma una operación de reducción (como la suma o concatenación) y combina los elementos del stream en un solo valor.

### anyMatch, allMatch, noneMatch:
- Propósito: Verifica condiciones en los elementos.
- Descripción: Evalúan predicados en los elementos del stream:
  - **anyMatch**: Devuelve true si cualquier elemento cumple con el predicado.
  - **allMatch**: Devuelve true si todos los elementos cumplen con el predicado.
  - **noneMatch**: Devuelve true si ningún elemento cumple con el predicado.

### findFirst, findAny:
- Propósito: Encuentra elementos.
- Descripción: Devuelven un Optional:
  - **findFirst**: Encuentra el primer elemento del stream.
  - **findAny**: Encuentra cualquier elemento del stream (útil en operaciones paralelas).

### peek:
- Propósito: Inspecciona elementos.
- Descripción: Permite realizar una operación en cada elemento del stream sin modificar el stream en sí. Útil para depuración.