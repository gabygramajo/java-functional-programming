# Java Functional
La programación funcional fue introducida en Java con la versión Java 8, lanzada en marzo de 2014.
Añadió las siguientes características:
- **Expresiones lambda**: permiten definir funciones anónimas de una manera más compacta y concisa.
- **Stream API**: permite realizar operaciones de procesamiento de datos de una manera declarativa y funcional, como map, filter, reduce, etc.
- **Optional**: La clase Optional se utiliza para representar un valor que puede estar presente o no, y para evitar problemas con null.
- **Interfaces Funcionales**, **Method References** y **Default Methods** en Interfaces.

### ¿Qué es la programación funcional?
La programación funcional se enfoca en usar funciones puras y datos inmutables para crear programas más previsibles y manejables, permitiendo una mayor modularidad y facilitando el razonamiento sobre el código.

### Diferencia entre programación imperativa y declarativa

La programación imperativa se trata de decirle a la computadora cómo lograr un resultado, mientras que la programación declarativa se trata de decirle qué resultado se desea sin preocuparse tanto por los detalles del proceso.

#### Programación Imperativa
- Programación Orientada a Objetos.
#### Programación Declarativa
- Programación Funcional.

## Principales propiedades de la programación funcional

La programación funcional pura tiene un conjunto de reglas a seguir:

1. **Sin estado global**:
   - Se debe evitar el uso de variables globales o cualquier tipo de estado compartido entre funciones para evitar efectos secundarios.
2. **Funciones puras**:
   - Una función pura es una función que, para los mismos argumentos de entrada, siempre devuelve los mismos resultados y no tiene efectos secundarios.
3. **Inmutabilidad**:
   - En la programación funcional, los datos son inmutables, lo que significa que una vez que se crea un dato, no se puede cambiar. En lugar de modificar los datos existentes, se generan nuevas versiones de los datos.
4. **Funciones de Orden Superior**:
   - Las funciones pueden tomar otras funciones como argumentos y/o devolver funciones como resultados. Esto permite un alto nivel de abstracción y reutilización de código.
   - Ejemplo: _**map**_, _**filter**_ y _**reduce**_ son funciones de orden superior que se aplican a listas u otros iterables.

## Interfaces Funcionales
Una interfaz funcional es una interfaz con un único método abstracto, adecuado para el uso con lambdas.


Interfaces funcionales más comunes de usar del package [**java.util.function**](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html):
 
**`Function<T, R>`:**

- Descripción: Representa una función que acepta un argumento y produce un resultado.
- Método abstracto: R apply(T t)
- Para mapear o transformar valores en un stream.

**`Predicate< T >`:**

- Descripción: Representa una función que acepta un argumento y devuelve un valor booleano.
- Método abstracto: boolean test(T t)
- Para filtrar elementos en una colección o stream.

**`Consumer < T >`:**

- Descripción: Representa una operación que acepta un único argumento y no devuelve resultado.
- Método abstracto: void accept(T t)
- Para realizar operaciones sobre cada elemento de una colección o stream, como imprimir o modificar.

**`Supplier <T>`:**

- Descripción: Representa una función que no acepta argumentos y produce un resultado.
- Método abstracto: T get()
- Para generar o proporcionar valores bajo demanda, como crear nuevas instancias.

## Stream

La [**API Stream**](https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/util/stream/Stream.html) de Java proporciona un conjunto de operaciones que permiten procesar datos de forma declarativa y concisa.

Algunas funciones:

### `filter`:

- Propósito: Filtra elementos de un stream.
- Descripción: Toma un predicado (una condición booleana) y devuelve un nuevo stream que contiene solo los elementos que satisfacen esa condición.

### `map`:

- Propósito: Transforma elementos de un stream.
- Descripción: Toma una función que transforma un elemento en otro y devuelve un nuevo stream que contiene los elementos transformados.

### `flatMap`:

- Propósito: Aplana y transforma elementos.
- Descripción: Similar a map, pero cada elemento transformado puede producir múltiples elementos, que son aplanados en un único stream.

### `sorted`:

- Propósito: Ordena elementos de un stream.
- Descripción: Devuelve un nuevo stream con los elementos ordenados de acuerdo a un comparador proporcionado.

### `distinct`:

- Propósito: Elimina duplicados.
- Descripción: Devuelve un nuevo stream que contiene solo los elementos distintos (únicos) del stream original.

### `limit`:

- Propósito: Limita el tamaño del stream.
- Descripción: Devuelve un nuevo stream que contiene no más de un número especificado de elementos del stream original.

### `skip`:

- Propósito: Salta elementos.
- Descripción: Devuelve un nuevo stream que omite un número especificado de los primeros elementos.

### `collect`:

- Propósito: Acumula los elementos en una colección o una estructura de datos.
- Descripción: Toma un Collector y acumula los elementos del stream en una colección, lista, conjunto, mapa u otra estructura de datos.

### `forEach`:

- Propósito: Realiza una acción en cada elemento.
- Descripción: Toma un Consumer y aplica esa operación a cada elemento del stream, principalmente se utiliza para operaciones finales como imprimir.

### `reduce`:

- Propósito: Combina elementos en un único valor.
- Descripción: Toma una operación de reducción (como la suma o concatenación) y combina los elementos del stream en un solo valor.

### `anyMatch, allMatch, noneMatch`:
- Propósito: Verifica condiciones en los elementos.
- Descripción: Evalúan predicados en los elementos del stream:
  - **anyMatch**: Devuelve true si cualquier elemento cumple con el predicado.
  - **allMatch**: Devuelve true si todos los elementos cumplen con el predicado.
  - **noneMatch**: Devuelve true si ningún elemento cumple con el predicado.

### `findFirst, findAny`:
- Propósito: Encuentra elementos.
- Descripción: Devuelven un Optional:
  - **findFirst**: Encuentra el primer elemento del stream.
  - **findAny**: Encuentra cualquier elemento del stream (útil en operaciones paralelas).

### `peek`:
- Propósito: Inspecciona elementos.
- Descripción: Permite realizar una operación en cada elemento del stream sin modificar el stream en sí. Útil para depuración.

## Optional

* Es una clase que se introdujo en Java 8 como parte del paquete `java.util`. 

Es un contenedor que puede contener o no un valor no nulo.
En lugar de devolver null para indicar que no hay resultado, un método puede devolver un Optional vacío, eliminando la necesidad de manejar explícitamente valores null y reduciendo así el riesgo de errores de tipo `NullPointerException`.

### Creación de Optional

#### `Optional.of(T value)`:

* Crea un Optional que contiene un valor no nulo.
* Ejemplo: Optional<String> optional = Optional.of("Hello");
* Lanza NullPointerException si el valor es null.

#### `Optional.ofNullable(T value)`:

* Crea un Optional que puede contener un valor no nulo o estar vacío si el valor es null.
* Ejemplo: Optional<String> optional = Optional.ofNullable(possibleNullValue);

#### `Optional.empty()`:

* Crea un Optional vacío.
* Ejemplo: Optional<String> emptyOptional = Optional.empty();

### Verificación de Presencia

#### `boolean isPresent()`:

* Retorna true si hay un valor presente, de lo contrario false.
* Ejemplo: if(optional.isPresent()) { // do something }

#### `boolean isEmpty()`:

* Retorna true si no hay un valor presente, de lo contrario false.
* Ejemplo: if(optional.isEmpty()) { // do something }

### Obtención del Valor

#### `T get()`:

* Retorna el valor si está presente, lanza NoSuchElementException si el Optional está vacío.
* Ejemplo: String value = optional.get();

#### `T orElse(T other)`:

* Retorna el valor si está presente, de lo contrario retorna other.
* Ejemplo: String value = optional.orElse("Default Value");

#### `T orElseGet(Supplier<? extends T> other)`:

* Retorna el valor si está presente, de lo contrario invoca el Supplier y retorna su resultado.
* Ejemplo: String value = optional.orElseGet(() -> "Default Value");

#### `T orElseThrow()`:

* Retorna el valor si está presente, de lo contrario lanza NoSuchElementException.
* Ejemplo: String value = optional.orElseThrow();

#### `<X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X`:

* Retorna el valor si está presente, de lo contrario lanza una excepción creada por el Supplier.
* Ejemplo: String value = optional.orElseThrow(() -> new RuntimeException("No value present"));

### Transformación y Filtrado

#### `<U>Optional<U> map(Function<? super T, ? extends U> mapper)`:

* Si un valor está presente, aplica la función mapper a él y retorna un Optional con el resultado.
* Ejemplo: Optional<Integer> length = optional.map(String::length);

#### `<U>Optional<U> flatMap(Function<? super T, Optional<U>> mapper)`:

* Similar a map, pero el mapper retorna un Optional en lugar de un valor.
* Ejemplo: Optional<Integer> length = optional.flatMap(value -> Optional.of(value.length()));

#### `Optional<T> filter(Predicate<? super T> predicate)`:

* Si un valor está presente y cumple con él `predicate`, retorna un Optional con el valor; de lo contrario, retorna un Optional vacío.
* Ejemplo: Optional<String> filtered = optional.filter(value -> value.length() > 3);