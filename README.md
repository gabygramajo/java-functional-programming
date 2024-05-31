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

