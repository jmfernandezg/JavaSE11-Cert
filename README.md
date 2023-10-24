
# GUIA DE ESTUDIO OCA 1Z0-815

## Temas

1. Bienvenido a Java
2. Fundamentos de Java
3. Operadores
4. Tomando decisiones
5. API's basicos
6. Interfaces funcionales y lambdas
7. Diseño de clases
8. Diseño de clases avanzado
9. Excepciones
10. Modulos

## Contenido

1. Bienvenido a Java
   1. Aprender del ambiente de Java
      1. Componentes de Java
      2. Descargando un JDK
   2. Beneficios de Java
   3. Estructura de clases
      1. Campos y métodos
      2. Comentarios
      3. Clases vs Archivos
   4. Escribiendo el método `main`
      1. Creando el método
      2. Pasando parámetros
      3. Ejecutando un programa
   5. Entendiendo la declaración de paquete y las importaciones
      1. Comodines
      2. Redundancia
      3. Conflictos de nombrados
      4. Creando un nuevo paquete
      5. Compilando y ejecutando un programa con paq uetes
      6. Usando un directorio alterno
      7. Compilar a JAR
      8. Crear un JAR
      9. Ejecutar un un programa con paquetes
   6. Ordenando elementos en una clase
   7. Formato de Código
   8. Resumen
   9. Esenciales del examen
   10. Preguntas del Examen

## Objetivos

|Objetivo | Capitulo|
|---------|---------|
| Describir la tecnología Java | 1
| Identificar características de java | 1
| Crear un ejecutable con una clase main | 1
| Compilar y ejecutar un programa | 1
| Crear e importar paquetes | 1
| Definir la estructura de una clase | 1
| Leer o escribir a los miembros de una clase| 2
| Declarar e inicializar variables | 2, 3
| Identificar alcance de variable | 2
| Usar inferencia de tipos | 2
| Crear y manipular objetos de Java y explicar ciclo de vida | 2
| Usar operadores y precedencia | 3
| Usar operadores de control if, else, switch | 4
| Crear do/while, while y for loops | 4
| Crear y manipular Strings | 5
| Manipular datos con StringBuilder | 5
| Crear y manipular arreglos de una dimension | 5
| Crear y manipular arreglos multidimensional | 5
| Crear métodos y constructores | 7
| Crear métodos sobrecargados | 7
| Aplicar `static` keyword | 7
| Aplicando modificadores de acceso | 7
| Aplicar encapsulamiento | 7
| Crear y usar sub clases y super clases | 8
| Crear y extender clases abstractas | 8
| Habilitar polimorfismo | 8
| Diferenciar entre tipo de objeto y de referencia | 8
| Distinguir entre sobre carga, sobre escritura y ocultamiento | 8
| Crear y usar interfaces | 9
| Distinguir herencia de  interface y clases abgstractas | 9
| Declarando y usando List y ArrayList | 5 ,6
| Entendiendo expresiones lambda| 6

## Test de Fundamentos 1

### 1. Considera el siguiente código. ¿Cuántas veces se imprime `2`?

```java

public static void main(String[] args) {
   int[] valores = { 10, 30, 50 };
   for(int val : valores){
       int x = 0;
       while(x<valores.length){
         System.out.println (x+" "+val);
          x++;
        }
   }              
}

```

1. [ ]  0
2. [ ]  1
3. [ ]  2
4. [X]  3

Respuesta: 3 por que el ciclo `while` se ejecuta 3 veces

### 2. ¿Qué método se debe de implementar por una clase implementando la interfaz `java.lang.Callable`?

1. [ ] `run()`
2. [ ] `execute()`
3. [X] `call()`
4. [ ] `do()`

Respuesta: `call()`. Callable es usado cuando se espera que el hilo regrese un resultado. El resultado de `call()` puede ser obtenido a través de un objeto `Future`

## 3. Considera el siguiente código. ¿Qué correcciones se le pueden aplicar para que compile sin errores?
  
  ```java

public abstract class TestClass{
   public abstract void m1();

   public abstract void m2(){
      System.out.println("hello");
   }
}
```

Seleccionar 2

- [X] Reemplazar el cuerpo del método `m2()` con `;`
- [ ] Reemplazar el `;` al final del `m1()` con un cuerpo
- [X] Remover `abstract` de `m2()`
- [ ] Remover `abstract` de la declaración de las clases

Respuesta: 1 y 3. Un método abstracto no puede tener cuerpo y un método abstracto no puede ser `private` o `final`

### 4. ¿Qué va a imprimir el siguiente código?

```java

System.out.println("12345".charAt(6));

```

1. [ ] 5
2. [ ] null
3. [ ] -1
4. [ ] Lanza `ArrayIndexOutOfBoundsException`
5. [ ] Lanza `StringOutOfBoundsException`
6. [X] Lanza `IndexOutOfBoundsException`

Respuesta:

- Lanza `IndexOutOfBoundsException` conforme al API de String
- Lanza un `StringIndexOutOfBoundsException` que es una subclase de `IndexOutOfBoundsException`

```java
 @throws  IndexOutOfBoundsException  if the {@code index}  
argument is negative or not less than the length of this string.
```

### 5. ¿Qué premisas de la conversión son verdaderas?

Seleccione 4

1. [X] Convertir de char a long no requiere un cast
2. [X] Convertir de byte a short no requiere un cast
3. [X] Convertir de short a char requiere un cast
4. [ ] Convertir de int a float requiere un cast
5. [X] Convertir de byte, char o short a int, long o float no requiere de cast

Respuesta: 1, 2, 3 y 5.

- Convertir de `short` a `char` requiere un cast por que `char` es unsigned y `short` es signed.
- Convertir de `int` a `float` no requiere un cast por que `int` es signed y `float` es signed y puede contener el rango de valores de `int`.
- Convertir de `byte`, `char` o `short` a `int`, `long` o `float` no requiere de cast por que son tipos de datos mas pequeños que los tipos de datos a los que se convierten.

### 6. ¿Cuándo puede ser adquirido un objeto de consola?

1. [ ] Cuando la JVM se inicia desde la consola interactiva y explícitamente se redirige standard input y output a Console
2. [X] Cuando la JVM se inicia desde la consola interactiva  y no se redirige explícitamente standard input y output
3. [ ] Cuando la JVM se inicia desde un proceso en segundo plano y explícitamente se redirige standard input y output a Console
4. [ ] Cuando la JVM se inicia desde un proceso en segundo plano y no se redirige standard input y output a Console

Respuesta: 2. La consola de una JVM depende de la plataforma y la forma en que es invocada.

- Si la JVM es invocada desde la consola interactiva, entonces la consola es disponible.
- Si la JVM es invocada desde un proceso en segundo plano, entonces la consola no es disponible.

### 7. Identifica la sentencia verdadera del siguiente código `List estudiantes = new ArrayList();`?

1. [X] El tipo de referencia es `List` y el tipo de objeto es `ArrayList`
2. [ ]  El tipo de referencia es `ArrayList` y el tipo de objeto es `ArrayList`
3. [ ]  El tipo de referencia es `ArrayList` y el tipo de objeto es `List`
4. [ ]  El tipo de referencia es `List` y el tipo de Objeto es `ArrayList`

Respuesta: 1. El tipo de referencia es `List` y el tipo de objeto es `ArrayList`. El tipo de referencia es el tipo declarado la variable y el tipo de objeto es el tipo de la instancia.

### 8. Como puedes declarar un método `miMétodo()`? de forma que no se necesite una instancia de la clase para acceder y todos los miembros del paquete tengan acceso

Selecciona 3 opciones

1. [X] `public static void miMétodo()`
2. [X] `static void miMétodo()`
3. [X] `protected void static miMétodo()`
4. [ ] `void miMétodo()`
5. [ ] `protected void miMétodo()`
6. [ ] `public abstract static void miMétodo()`

Respuesta: 1, 2 y 3.

- Un método `static` puede ser accedido sin una instancia de la clase.
- Un método `static` puede ser accedido por cualquier miembro del paquete.
- Un método `static` no puede ser `abstract` por que no puede ser sobrescrito.

### 9. ¿Qué es verdadero de una interfaz Funcional?

1. [ ]  Tiene un método y debe de ser abstracto
2. [ ]  Tiene un método y puede ser abstracto
3. [X]  Tiene un método abstracto y puede tener métodos estáticos o default
4. [ ]  Tiene un método estático y puede tener métodos abstractos o default

Respuesta: 3. Una interfaz funcional tiene un método abstracto y puede tener métodos estáticos o default.

- Una interfaz funcional puede tener cualquier número de métodos default o estáticos.
- Una interfaz funcional puede tener cualquier número de métodos `private` o `private static` pero no puede tener métodos `private abstract` o `private static abstract`

### 10. ¿Qué es verdadero de `break`  y `continue` ?

1. [X] `break` sin etiquetar puede ocurrir solo en `switch`, `while`, `do` y `for`
2. [ ] `continue` sin etiquetar puede ocurrir solo en `switch`, `while`, `do` y `for`
3. [ ] `break` no puede ocurrir sin etiqueta
4. [ ] `continue` no puede ocurrir CON etiqueta
5. []  Ninguna de las anteriores

Respuesta: 1. `break` sin etiqueta puede ocurrir solo en `switch`, `while`, `do` y `for`

- Si no se especifica una etiqueta, `break` termina el bloque mas cercano
- Si no hay un bloque switch, while, do o for, entonces `break` no puede ocurrir.
- `continue` sin etiqueta puede ocurrir solo en `while`, `do` y `for`, y no puede en `switch` en ningún momento.

### 11. ¿Cuáles clases son thread safe?

Selecciona 2

1. [ ] java.util.Date
2. [X] java.time.Instant
3. [ ] java.util.Calendar
4. [ ] java.util.GregorianCalendar
5. [X] java.time.Duration

Respuesta: 2 y 5 por que las clases del paquete `java.time` son inmutables y por lo tanto thread safe.

- Las clases del paquete `java.util` no son thread safe. `java.util.Date` y `java.util.Calendar` son mutables y por lo tanto no son thread safe.
- `java.util.GregorianCalendar` es una subclase de `java.util.Calendar` y por lo tanto no es thread safe.
- `java.time.Duration` es inmutable y por lo tanto thread safe.

### 12. ¿Qué es verdadero de una interfaz?

Selecciona 4

1. [X] Las interfases siempre son abstractas
2. [X] Las interfaces pueden tener métodos estáticos
3. [ ] Todos los métodos de una interfaz son abstractos aunque no se especifique
4. [ ] Los campos de una interfase pueden ser declarados transient o volatile pero no `synchronized`
5. [X] Las interfaces no pueden ser finales
6. [X] Las interfaces permiten herencia multiple a través de métodos default

Respuesta: 1, 2, 4 y 5.

- Las interfaces siempre son abstractas. y pueden tener métodos estáticos y default.
- Una interfaz puede tener método default y es considerado no abstracto.
- Una clase no abstracta que implementa la interfaz no necesita implementar el método default. Las interfaces no pueden ser finales.
- Las interfaces permiten herencia multiple a través de métodos default. Si una clase implementa dos interfaces que tienen métodos default con la misma firma, la clase debe de implementar el método.

### 13. ¿Qué se requiere para construir una `Locale`?

1. [X] Lenguaje
2. [ ] Región
3. [ ] País
4. [ ] Zona horaria
5. [ ] Estado
6. [ ] Cultura

Respuesta: 1. Locale necesita un lenguaje. Un lenguaje es un idioma como `en` para ingles o `es` para español.

- Un lenguaje es requerido para construir un `Locale`.
- Un `Locale` puede tener una región, un país, una zona horaria, o una variante pero no son requeridos.

### 14. ¿Qué es valido ?

Seleccione 2

1. [ ] `List<String> lista = new List<>();`
2. [ ] `ArrayList<String> lista = new List<String>();`
3. [ ] `ArrayList<> lista = new ArrayList<>();`
4. [X] `List<String> lista = new ArrayList<>();`
5. [x] `List<> lista = new ArrayList<>(6);`

Respuesta: 4 y 5. `List` es una interfaz y no puede tener instancias. Cuando se crea un `ArrayList` es posible especificar el tamaño del arreglo

### 15. ¿Qué no es parte de `StringBuilder`?

1. [X] `trim()`
2. [ ] `ensureCapacity(int)`
3. [ ] `append(boolean)`
4. [ ] `reverse()`
5. [ ] `setLength(int)`
6. [ ] `compareTo`

Respuesta: 1. El método `trim` es parte de String. `StringBuilder` no tiene un método `trim`.

- `StringBuilder` tiene un método `ensureCapacity` que incrementa la capacidad del arreglo interno al mínimo especificado.
- `StringBuilder` tiene un método `append` que agrega un valor al final del `StringBuilder`.
- `StringBuilder` tiene un método `reverse` que invierte el contenido del `StringBuilder`.
- `StringBuilder` tiene un método `setLength` que cambia la longitud del `StringBuilder`.
- `StringBuilder` tiene un método `compareTo` que hace una comparación lexicográfica como esta definido en `CharSequence`.

### 16. ¿Qué es verdadero?

Selecciona 2

1. [ ] Todas las clases deben de definir un constructor explícitamente
2. [X] Un constructor puede ser privado
3. [ ] Un constructor puede declarar un valor de retorno
4. [ ] Un constructor debe de inicializar todos los miembros de la clase
5. [X] Un constructor puede tener acceso a los miembros no estáticos de la clase

Respuesta: 2 y 5. Un constructor sin argumentos se crea de forma automática si no se define un constructor.

- Un constructor puede ser privado, como en las clases de Singleton. Un constructor no puede declarar un valor de retorno.
- Un constructor no necesita inicializar todos los miembros de la clase, ya que serán puestos valores default.
- Un constructor puede tener acceso a los miembros estáticos y no estáticos de la clase.

### 17. ¿Qué opciones son verdaderas para declarar una variable que puede referenciar a un arreglo de 10 enteros

Seleccione 2

1. [X] `int[] arr`
1. [ ] `int[10] arr`
1. [X] `int arr[]`
1. [ ] `Object[] arr`
1. [ ] `Object[10] arr`

Respuesta: 1 y 3. La dimensión de un arreglo no puede ser especificada del lado izquierdo de la expresión.

### 18. ¿Es posible declarar arreglos de longitud cero?

1. [X] Si, para cualquier tipo de arreglo
2. [ ] Si, pero solo para arreglos de primitivos
3. [ ] Si, pero solo para arreglos de objetos
4. [ ] Si, es lo mismo que declarar un arreglo nulo
5. [ ] No, no es posible declarar arreglos de longitud cero

Respuesta: 1. Es posible declarar arreglos de longitud cero para cualquier tipo de arreglo.

- Un arreglo nulo no puede ser accedido y lanza un `NullPointerException`. Un arreglo de longitud cero puede ser accedido y no lanza un `NullPointerException`.

### 19. Que es valido para compilar y ejecutar?

Seleccione 4

1. [X] `if (9 == 1) {}`
1. [ ] `if (y = 1) {} // asume que Y es int`
1. [X] `if (false) {}`
1. [X] `if (y = false) {} // asume que Y es boolean`
1. [X] `if (y == 1? false: true) {}`

Respuesta: 1, 3, 4 y 5. La expresión `if(...)` requiere de un booleano.

- `if (9 == 1) {}` es valido por que `9 == 1` es un booleano.
- `if (y = 1) {}` no es valido por que `y = 1` es un entero.
- `if (false) {}` es valido por que `false` es un booleano.
- `if (y = false) {}` es valido por que `y = false` es un booleano.
- `if (y == 1? false: true) {}` es valido por que `y == 1? false: true` es un booleano.

### 20. ¿Qué es verdadero ?

Seleccione 3

1. [X] La expresión de la condiciones de un `if` puede ser una llamada a un método
2. [X] Si `x` y `y` son de tipo booleano, `if (x = y) {}` es valido `if`
3. [ ] Una expresión if puede tener un `if` o un `else`
4. [ ] La expresión `if (false); else;` es inválida
5. [X] Solo las expresiones que evaluan a un booleano pueden ser usadas en un `if`

Respuesta: 1, 2 y 5

- La expresión puede ser una llamada a un método, como en `if (x.equals(y)) {}` siempre  y cuando el método regrese un booleano.
- `if (x = y) {}` es valido por que `x = y` es un booleano.
- Una expresión `if` debe de tener un `if`, pero  `else` es opcional.
- `if (false); else;` es valido por que `false` es un booleano.

### 21. ¿Qué clausulas son usadas por la definición de un modulo que utiliza un servicio

Seleccione 2

1. [ ] `exports`
1. [X] `uses`
1. [ ] `provides`
1. [ ] `implements`
1. [X] `requires`

Respuesta: 2 y 5

- La cláusula `uses` es usada para declarar que el módulo utiliza un servicio.
- La clausula `requires` es usada para declarar que el módulo requiere de un módulo que define la interfaz del servicio.

### 22. ¿Qué es verdadero?

Seleccione 2

1. [X] El método `length()` de `String` es un método final
2. [ ] Puedes subclases mutables de `String`
3. [ ] `StringBuilder` extiende de `String`
4. [X] `StringBuilder` es final
5. [ ] `String` no es final

Respuesta: 1 y 4

- La clase `String` es final y todos sus métodos son final.
- La clase `StringBuilder` es final y no puede tener sub clases.

### 23. Identifica ejemplos de auto boxing

Seleccione 3

1. [ ] `Long x = Long.valueOf(100);`
2. [X] `Integer i = 10;`
3. [X] `Integer i() { return 10;}`
4. [X] `Long i() { return 10;}`
5. [ ]  `System.out.println(10 + "");`

Respuesta: 2, 3 y 4

- La asignación de un valor primitivo a un objeto es auto boxing.
- `Long.valueOf(100)` no es auto boxing por que es una llamada a un método que regresa un `Long`.
- Cuando un operando es un `String`, el otro operando es convertido a `String`.

### 24. Que operadores se pueden usar en conjunto con un String?

Seleccione 3

1. [X] `+`
2. [ ] `++`
3. [X] `+=`
4. [X] `.`
5. [ ] `*`

Respuesta: 1, 3 y 4.

- El operador `+` concatena un `String` con otro `String` o con un valor primitivo.
- El operador `+=` sobrecarga a + y concatena un `String` a un `String` o a un valor primitivo.
- El operador `.` accede a los miembros de un `String`.

### 25. Considera el siguiente código. ¿Qué es verdadero?

```java
class MiStr extends String{
    MiStr(String s){
        super(s);
    }
}
```


1. [ ] El código compila y corre sin problemas
2. [X] El código no compila

Respuesta: 2 por que `String` es final.

- `String` es final y no puede ser extendido.
- Otras clases finales son `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean`, `Short`, `Byte`, `Void`, `StringBuffer`, `StringBuilder`, `java.lang.System`

### 26. Que métodos son parte de `String`?

Seleccione 5

1. [X] `isBlank()`
1. [X] `isEmpty()`
1. [X] `lines()`
1. [ ] `isNull()`
1. [X] `strip()`
1. [X] `indent()`

Respuesta: 1, 2, 3, 5 y 6

- `isBlank()` regresa `true` si la cadena esta vacía o contiene solo espacios en blanco.
- `isEmpty()` regresa `true` si la cadena esta vacía.
- `lines()` regresa un `Stream` de `String` que contiene las líneas de la cadena.
- `strip()` regresa una cadena sin espacios en blanco al inicio o al final.
- `indent()` regresa una cadena con cada línea indentada.
- `isNull()` no es un método de `String`.
- `isBlank()` y `strip()` son métodos agregados en Java 11.
- `lines()` y `indent()` son métodos agregados en Java 12.

### 27. ¿Qué es verdadero de `java.util.function.IntFunction`?

1. [ ] Representa una función que regresa un int
2. [X] Evita el uso de auto boxing
3. [ ] Extiende de `java.util.function.Function`
4. [ ] No puede ser parametrizado

Respuesta: 2

- `java.util.function.IntFunction` representa una función que toma una `int` como parámetro y regresa un objeto.
- Ninguna de las interfaces funcionales para primitivos extiende de `java.util.function.Function`.
- El tipo de parámetro de `java.util.function.IntFunction` es `int` y no puede ser cambiado pero tipo de retorno si.
- Evita el uso de auto boxing por que el tipo de parámetro es `int` y no `Integer`. Para eliminar el costo de auto boxing, se pueden usar interfaces funcionales para primitivos como IntFunction.
- Cuando se procesan streams de primitivos se deben de usar interfaces funcionales para primitivos para evitar el costo de auto boxing como IntStream, LongStream y DoubleStream. y las interfaces funcionales para primitivos como IntFunction, LongFunction y DoubleFunction.

### 28. ¿Qué comandos están relacionados con el sistema de módulos?

Seleccione 2

1. [ ] `--module -p`
2. [X] `--module-path -p`
3. [ ] `--module-source-path -s`
4. [ ] `--module-source.path -m`
5. [ ] `--list-modules -l`
6. [ ] `--show-module-resolution -s`
7. [X] `--module -m`


Respuesta: 2 y 7

- Opciones aplicables para `java` y `javac`
  - `--module` o  `-m` especifica el modulo principal para compilar o ejecutar
  - `--module-path` o `-p` especifica el path de los módulos.
- Opciones aplicables para `javac`
  - `--module-source-path` no tiene atajos y especifica el path de los módulos fuente
- Opciones aplicables para `java`
  - `--list-modules` o `-l` lista los módulos disponibles
  - `--show-module-resolution` o `-s` muestra la resolución de los módulos
