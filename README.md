
Español
- <https://globant.udemy.com/course/curso-certificacion-profesional-desarrollador-java-se-11/>

## Sección 01. Introducción

### Tema 01. Introducción

- Desarrollador Java SE 11
- Examen `1z0-819`: Programador Java Certificado en un solo examen
- Los objetivos se concentran en un solo examen
- Dura 90 minutos
- Tiene 50 preguntas
- Porcentaje para aprobar 68%
- Precio 220 euros

#### Objetivos

- Java, tipois de dato y control de flujo
  - Tipos de datos, operadores y procedencia
  - Manipulación de textos mediante p  y `StringBuilder`
  - Inferencia de Tipos (Java 10+)
  - Instrucciones de control de Flujo

- Programación orientada a objetos
  - Declarar e instancias de objetos, incluyendo anidados
  - Ciclo de vida de objetos
  - Campos, métodos y miembros estáticos
  - Encapsulacion e inmutabilidad
  - Herencia
  - Polimorfismo
  - Interfaces e interfaces funcionales. Metodos en interfaces
  - Enumeraciones

#### Objetivos II

- Arrays y colecciones
  - Declarar, instanciar, inicializar y usar arrays
  - Tipos genericos
  - Listas, tablas conjuntos y colas doblas
  - Comparaciones de arrays y colecciones ***se pregunta***

- Modularidad
  - Desplegar y ejecutar aplicaciones modulares (Java 9+)
    - Que es un modulo,  ***se pregunta***
  - Declarar y exponer modulos, incluyendo servicios

- API Java I/O
  - Lecutra y escritura de archivos y consola
  - Serializacion de serializacion de objetos
  - Manejo de ficheros atraves de `java.nio.file`

#### Objetivos III

- Acceso a base de datos con `JDBC`
  - Conexion a BD y `SQL`
  - Procesar resultado mendiante `JDBC`

- Excepciones
  - Capturar con try, catch, finally, multicatch y try con recursos
  - Crear y usar excepciones personalizades

- Expresiones lanbda y streams
  - Implementar interfaces funcionales con lambdas **mas preguntas de examen**
    - Programacion funcional
  - Interfaces `java.util.function`
  - Utilizar sterams para filtrado, transformacion y precesado de datos
  - Reducciones de streams y procesamiento paralelo

#### Objetivos IV

- Concurrencia
  - Gestion de tareas Runnable y Callablew y el nuevo ExecutorService
  - Desarrollar codigo seguro `thread-safe`

- Anotaciones
  - Crear y apliucar y procesar anotaciones

- Localizacion
  - Implementar medante `Locale` y formateo dfe datos

- Codigo Seguro
  - Buenas practicas

## Seccion 02. Trabajando con Java y Tipos de Datos

### Tema 02 - Declara e Inicializa Variables

- Declaracion `Tipo variable` por ejemplo `Integer miInteger;`
- Declaracion e inicializacion `int myInt = 0 ;`
- Declaracion multiple `int x, y, z = 0 ;` del mismo tipo, separado por comas
- El nombre de las variables pude ser de letras, numeros y los caracteres `$` y `_`, todos los demas es incorrectos
- El nombre no puede usar palabras reservadas como identificador, `if`, `for`, `goto` cualquier que tenga un significado especial
- El nombre no puede comenzar con un numero

#### Declaracion de variables

- A nivel de una clase: se les conoce como atributos o campos. Son visibles para todos los metodos de la clase
- Locales: son visibles sonlo dentro del metodo donde estan declaradas
- Se puede declarar una variable local con el mismo nombre de una variable de la atributo. En este caso se accesan a las variables de tipo atributo con `this`

#### Inicializacion por defectos

- Las variables locales **NO** se inicializan por defecto. Es necesario asignarles un valor antes de usarlas
- Las variables de atributo **SI** se inicializan por defecto
  - Enteras: `0`
  - Decimales: `0.0`
  - boolean: `false`
  - char: `\u00000`
  - objeto: `null`

#### Objetos vs Promitivos

- Tipo Primitivo:
  - La variable contiene al dato
  - En una asignacion, cada variable tiene una copia del dato

```java

int r = 100;  // r = 100
int n=r     //n = 100

````

- Tipo objeto:
  - La variable contiene una referencia al dato.
  - Las variables apuntan al mismo objeto
  - En una asignacion, cada variable tiene una copia del dato

```java
var myObj = new Object();  // apunta AFB4
var otro = myObj  ;  // apunta a la misma referencia que myObj

```

### Tema 03 - Tipos Primitivos y de Objeto

#### Primitivos

- Son 8

|Tipo |Valores|Ejemplo
|---|---|---|
|boolean|true o false | true|
|byte | Entero de 8 bits | 39|
|short | Entero de 16 bits | 780
| int | Entero de 32 bits | 59400
| long | Entero de 64 bits | 2,000,000,000l
| float | Decimal de 32 bits | 59400.12f
| double | Decimalde 64 bits | 200.4243123
| char | uncode de 16 bits | `@`

#### Literales

- Los literales son un dato filjo
  - Decimal: 239 (cifras del 0 al 9)
  - Octal: 0453  (**empieza por 0**, va del 09 al 7)
  - Hexadecimal: 0xAF7 (**empieza por 0x** del 0 al 9 mas letras A,B,C,D,E,F)
  - Binario: 0b10001 (**empieza por 0b** una combinacion de 1's y 0s)
- Se puede usar `_`   para representar numeros enteros y decimales dentro de las cifras enteras
  - pero no se puede usar al principio o al final del numero
  - no se puede usar  junto al punto decimal
- Todo literal entero es un `int` implicita
  - Para que sea un literal numerico `long` termina con L
- Todo literal entero es un `double` implicita
  - Para que sea un literal numerico `float` termina con F

 ```java

int i = 2_345

long l = 2_345l
float f  = 1.1f

```

#### Conversiones de tipos

- Todos los tipos primnitivos son convertibles en otros, salvo `boolean`
- Las conversiones pueden ser implicitas
  - El tipo del destino que ser igual o mayor de tamo que el de origen
  - EXCEPTO Si el tipo de origen es numerico (cualquier tipo) no se puede converetir en `char`
  - EXCEPTO El tipo de origen es decimal (float, double) y el destino sea entero (float, int)

 ```java

char c = '@';
int i = c  // K
int num = 34500
byte r=(byte)num; // ok trynca explicita
char r=(char)34.5; // ok trynca explicita

```

#### Tipo Objeto

- Cualquier objeto de la clase Java
- Se manejan atraves de variables declaradas de su tipo
- La variable contiee una referencia al objeto
- Mediante una variable se accede a los metodos del objeto
- NO se hacen conversiones de Objeto a tipos primitivos

### Tema 04 - Ciclo de Vida de Objetos

#### Creacion de un objeto

- Un objeto se crea con el preador `new` seguido por el nombre del objeto y el constructor
- Se devuelve una referncia al objeto qeu se guarda en una variable de su tipo

#### Constructores

- Se ejecutan durante la craecion del objeto
- El constructor esta definido dentro de la clase
- Puede sobrecargarse

```java

class Clase1 {
    private String nombre= ""; 

    public Clase1(){

    }

    // otro constructor
    public Clase1(n: String){
        nombre = n
    }
}

Clase1 myClase = new Clase1();
String s = new String("HOLA!!");
Object ob = new Object();

```

#### Destruccion de un objeto

- En java la gestion de la memoria es llevada por el Garbaje Collector
  - Cuando ya no hay referencias al objeto
- Es elegido para recoleccion cuando no hay referencias al mismo
- Cuando un objeto es elegido para recolleccion, la JVM llama al mètodo `finalize()` Este momento puede ser llamado o solo **UNA** vez durante de vida del objeto. No es seguro, depende de la JVM

```java

Object ib1 = new Object();  // pone objeto1 
Object ib2 = new Object();  // pone objeto2

ib1 = ib2 ;   // pone objeto2 en ib1, pone objeto1 para recoleccion

ib2 = null;    // pone ib2 es NULL, pero objeto2 todavia es apuntado por ib1
              // objeto2 no es marcado para recoleccion

```

### Tema 05 - Clases de Envoltorio

- Encapsulan tipos primitivos como objetos
- Hay muchas operaciones en java que solo pueden ser realizadas por objetos, por ej. colleciones
- La representancion primitiva por `intValue(), doubleValue()`
- Tienen metodos estaticos `parseInt, Integer.valueOf`  para convertir `String` en tipo primitivo u objeto.

#### Autoboxing / boxing

- A partir de Java 5
- Se asigna directamente el valor numerico a una variable de tipo objeto y construye el objeto y lo envuelve
- Se puede asignar a una variable primitiva directamente de la variable objeto
- Las clases de enmvoltorio son inmutables, no se pueden modificar

```java
Integer ent = new Integer(200);
Integer otro = 200 // autoboxing
otro++; // unboxing y autoboxing 

ent = ent + 100 // genera un nuevo objeto, unboxing y autoboxing

int n = otro // unboxing

Double doble = new Double(1.0);

Double otroDoble = 200.23 // autoboxing
double primd = otroDoble // unboxing

Boolean bo = new Boolean(false);

int p = integer.intValue();
double d = doble.doubleValue();



```

### Tema 06 - Revision Preguntas Examen

#### T6. Pregunta 1

- GIven the code, which line fails?

```java

3. public static void main(String[] args) {
4. int ivar = 100;  // OK
5. float fvar = 23.4f; // OK
6. double dvar = 20;
7. ivar = fvar;  // NO se puede hacer implicito convertir de float a int
8.  fvar = ivar; // Si se puede implicito int a float
9.  dvar = fvar; // Si se puede hacer unplicito de float a double
10.  fvar = dvar; // NO se puede doble a float por que doble tiene 64 y float 32
11.  dvar = ivar; // Se puede de integer a doble
12.  ivar = dvar; // No se puede double 64 a int 32

}
```

#### T6. Pregunta 2

- GIven the code, which line fails?

```java

A. int a = 2.7;  // NO: un entero no puede recibir un literal decimal 

B. byte b  = (byte)1234.456;  // Se trunca a los primeros 8 bits, por ser ex`locotp

C. int a = 0b110_100;  // Correcto

E. double x = _2.7;  // Incorrecto, cartacter _ no puede empezar o terminar

F. float g = 23;  // Correcto

G. short k = (short)23l; // Correcto se puede todo con casting

H. boolean n = (boolean)1; // NO se pede hacer un casting a boolean

I. char vv = 300000000; // Requiere una conversion explicita 

```

#### T6. Pregunta 3

- Cuantas instancias se crean de marca

```java
public class Marca {
 int num;
 
 public static void save(Marca obj4){
            obj4.num +=10;
 }

public static void main(String[] args){
    Marca ob1 = new Marca();  // 1 obj
    Marca obj2 = ob1;  // 1 obj, se copia la referencia
    Marca obj3 = null;   // 1 obj, este es nulo
    obj2.num = 23; // 1 obj
    save(obj2);  // 11 objt
}

}

```

#### T6. Pregunta 4

- objetos para Recoleccion
  - obj10 cuando se le asigna a nulo
  - obj20 cuando termina el programa

```java

public class Test {

    public static void main(String[] args){
        Integer uno, dos;
        uno = new Integer(10); // obj10
        dos = new Integer(20); // obj20
        uno = dos;
        uno = null;  // obj1
   }

}
```

#### T6. Pregunta 5

- boxing y unboxing

```java

Integer k = 5; // ok, autoboxing
int p = 10, s; // ok, se declaran dos variables de tipo int
k = k + p; // ok, se hace unboxing y autoboxing
s = k; // ok, se hace un unboxing

System.out.println(s) // resultado 15

```

#### T6. Pregunta 6

```java

public class Tester {
    static double res;
    int a=2, b=3;

    public static void main(String[] args){
        double a,b,c; // ERROR!
        if (res == 0){
            a=1.5
            b=2;
            c=1;
        }

    }

}

```

### Tema 07 - Inferencia de TIpos

- Se incoporo con Java 10
- Se usa la palabra `var`
- Se usa en ***UNICAMENTE*** variables locales para inferir el tipo en tiempo de compilacion
- El compilador determina el tipo apartir del valor que se le asigna
- Simplifica la escritura del codigo
- No impacta el rendimiento
- No se puede con variables de tipo atributo
- Se necesita asignar explicitamente el nombre a la variable
- No se puede hacer en declaracikones multibles  `var a, b = 10; // mal`
- Se puede usar el los bucles `for`
- En arrays no puede usarse con inicializacion abreviada `var s = {5,6,7}; // mal`

```java
var b = DriverManager.getConn(usr,pass); // Correcto
var ej = 3 / 0 ;  // Correcto
var cad = ""; // Correcto
var n = null; // INcorrecto, nulo
var c, p = 10; // Incorrecto, no se puede multiple
var [] n = new int[4] // Incorrecto, los corchetes no se pueden usar con var

```

### Tema 08 - Revision Preguntas Examen

#### T8. Pregunta 1

```java

var a = b = c = 100;  //  no es posible inferencia de tipos en declaracion multiple
var a= 100, b = 10, var a= b; // no es posible, B 
int a, b, c = 100; // Correcto
int a = 10, b , c; // Correcto
int a = 100 = b = c ; // Incorrecto
int a = b = c = 100; // Incorrecto, no se puede asignar junto con la declaracion
int a, b, c; a = b = c= 100; // Correcto, se van asignando en cadena

```

#### T8. Pregunta 2

```java

int i = 5; // OK
var f = 5.5f // OK
double d = 3.3 // OK
var c = 'a'; // OK

if (i==f) c++; // OK -> falso

if (((int)(f+d)) == ((int)f + (int) d)) c += 2; // OK -> falso

System.out.println(c); // la letra *a*


```

#### T8. Pregunta 3

- El Archivo se llama `TestClass.java`

```java

class Test {} // Es correcto, se llama de 

public class TestClass {
    var a = 2 // Incorrecto! no se pueden usar var en tipos de atributo

   public static void main(String[] args){  // Correctamente definido
 
    var v2; // No es valido, no se le asigna un valor a VAR
    double x = 10, double y; // No es correcto, si indicas el tipo de las dos variables se tiene que separar por punto y coma
    System.out.println[] // No vale, necesita parentensis
    for (var i=0;i<100;i``){}
    
   }

}


#### T8. Pregunta 4

- El Archivo se llama `Test.java`

```java

public class Test {
    
    public static void change(String in) {
        in = in + "BYE"; 
    }

    public static void main(String[] args) {
        String arg = "HELLO ";

        change(arg);

        System.out.println(arg); 
        // Se imprimira hello
    }
}

```


#### T8. Pregunta 5

- El Archivo se llama `Test.java`

```ºpackage javase11.cert;

public class Test {
    
    public static void change(String in) {

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5); // Se inicialia a cadenas vacias
        String s =  "";

        if (sb.equals(s)){ // falso, objetos de tipos diferentes
            System.out.println("OPCION A");

        } else if (sb.toString().equals(s.toString())){ // VERDADERO
            System.out.println(" OPCION B");  // esto se imprime
        } else {
            System.out.println(" OPCION C");
        }

    }
}

```

#### T8. Pregunta 6

- Cual es verdadero

```java
```


### Tema 09 - Operadores Java

#### Aritmeticos

- Se emplean con tipos numericos primitivos para hacer operaciones artimeticas
- Operador incrementar `+`
- Operador decrementar `-`
- Operador multiplicar `*`
- Operador dividir `/`: el resultado de dividir dos enteros el resultado es un entero
- Modulo `%`
- Los operadores `++` y `--` se usan con tipos numericos y pueden ir  delante o detras de una variable

#### Asignacion

- Asignar el resultado de una expresion a una variable `=`
- Operador incrementar `+=` realiza la operacion entre un dato y la variable
- Operador decrementar `-=` realiza la operacion entre un dato y la variable
- Operador dividir `/=` realiza la operacion entre un dato y la variable
- Operador multiplicar `*/*=` realiza la operacion entre un dato y la variable

#### Condicionales

- Mayor que `>`, menur que `<`, igual `==`, desigual `!=`
- Operador "not"  `!`
- Modo corto circuito: si un operado a la izquierda evalua al falso, la siguiente operacion no se evalua
  - Operador "and" `&&`
  - Operador "or"  `||`

#### Otros

- Crear objetos `new`
- Comprobar si una variable es de un determinado tipo `instanceOf`

### Tema 10 - Igualdad de Objeto

- Operador `==`
  - Se usan para comparar dos tipos primitivos
  - Si se usan en objetos, solo da verdadero si las variables tienen la misma referencia o se les asigna la misma literal (`int, string`). Esto incluye a los objetos de envoltorio.

- Operador `equals`
  - Para comparar dos objetos
  - Sensible a la capitalizacion

- Pool de cadenas
  - Java usa uyn pool de literales de cadenas de caracteres para optimizar la memoria
  - Al asignar un literal de cadena no se crea un nuevo objeto, se revisa si existe en el pool y devuelve la referencia al objeto existente. Si no existe, se crea y se graba en el pool.

- StringbBuilder
  - Representa cadenas mutables
  - No se le puedfe asignar directamente literales
  - No sobrescribe `equals`, funciona igual que `==`. Solo daria verdadero si apuntan a la misma referencia del objeto.

#### Inmutablidad de String

- Un String es una cadena de caracteres inmutable, no se puede modificar
- En la concatenacion, no se modifica nada, se crea uno nuevo

### Tema 11 - Revision Preguntas Examen

#### T11. Pregunta 1

```java

// primero se ejecuta de izquierda a derecha
System.out.println("6+3=" + 2 + 7) // 6 + 3 = 27

// primero se ejecuta lo que esta entre parentesis
System.out.println("6+3=" + (2+7)); // 6 + 3 = 9
```

#### T11. Pregunta 2

```java

public Class Test {
    static int i;

    public static void main(String[] args) {

        int a = 2, b = i + 1 ;

        if ( (a++ > ++b) && (++a>5)){  // falso  (2 > 2) && ... corto circuito
            a += b;
        }

    } // a vale 3 

}

```

#### T11. Pregunta 3

```java

StringBiulder sb1 = new String("Hello")
String str1 = sb1.toString()

// Hacer que println retorne true
String str2 = str1; 


System.out.println(str1 == str2)
```

#### T11. Pregunta 4

```java
 class Test {


    public static void main(String[] args) {
        String arg = "hello";

        // se pasa la referencia de la variable
        change(arg);
        System.out.println
        
    }

    private static void change(String str) {
        str += "bye"; 
    }
 }
```

#### T11. Pregunta 5

```java

```

****## Seccion 03. Estructura de Control de Flujo

### Tema 12 - Operador `if` y ternario

### Tema 13 - Uso de `switch`

### Tema 14 - Revision Preguntas Examen

#### T14. Pregunta 1

```java
```

### Tema 15 - Instrucciones repetitivas `for` y `while`

### Tema 16 - Uso de `break` y `continue`

### Tema 17 - Revision Preguntas Examen

#### T17. Pregunta 1

```java
```
