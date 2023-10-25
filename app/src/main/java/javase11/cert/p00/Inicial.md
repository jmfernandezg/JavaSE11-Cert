# Inicial

## 1. ¿Cuál es el resultado del siguiente programa?

```java
     public class Funciones {
        public static void agregar(int num, int cantidad) {
                    num = num + cantidad;
        }
        public static void main(String[] args) {[1]
            var x = 5;
            var y = 20;
           Funciones.agregar(x, y);
           System.out.println(x); } 
    }
```

1. [ ] 20
1. [ ] 25
1. [X] 5
1. [ ] Error de compilación en la línea 3
1. [ ] Error de compilación en la línea 8
1. [ ] Ninguna de las anteriores


Respuesta: 5.

### Explicación

La variable `x` se pasa por valor a la función `agregar`, por lo que el valor de `x` no cambia. Si se hubiera pasado por referencia, el valor de `x` sería 25.

## 2. ¿Cuál es la salida del siguiente programa?

Selecciona todas las respuestas aplicables

```java
interface TieneCola { int getLongitudCola(); }

abstract class Puma implements TieneCola {
 protected int getLongitudCola() { return 4; }
}

public class Jaguar implements TieneCola {
 
    public static void main(String[] args) {
        var puma = new Puma();
        System.out.println(puma.getLongitudCola());
     }
    public int getLongitudCola(int length) { return 2; }
}
```

1. [ ]  2
1. [ ]  4
1. [ ]  El código no se compilará debido a la línea 3.
1. [ ]  El código no se compilará debido a la línea 5.
1. [X]  El código no se compilará debido a la línea 7.
1. [ ]  El código no se compilará debido a la línea 10.
1. [ ]  No se puede determinar la salida a partir del código proporcionado.

Respuesta: 5. El código no se compilará debido a la línea 7.

### Explicación 2

La línea 7 intenta crear una instancia de la clase `Puma`, que es una clase abstracta y no se puede crear una instancia directamente. Por lo tanto, el código no se compilará debido a esta línea. Las otras opciones no son relevantes porque el código no llega a ejecutarse.


## 3. ¿Cuál es la salida del siguiente programa?

```java

int luna = 9, estrella = 2 + 2 * 3;
float sol = estrella > 10 ? 1 : 3;
double júpiter = (sol + luna) - 1.0f;
int marte = --luna <= 8 ? 2 : 3;
System.out.println(sol + "-" + júpiter + "-" + marte);

```

1. [ ] 1-11-2
1. [X] 3.0-11.0-2
1. [ ] 1.0-11.0-3
1. [ ] 3.0-13.0-3
1. [ ] 3.0f-12-2
1. [ ] El código no compila

### Explicación 3

- luna se inicia en 9.
- estrella inicia en 8, debido a la precedencia de los operadores primero se multiplica y después de se suma
- sol es 3.0, debido a que estrella es menor a 10, se asigna 3.0
- júpiter es 11, debido a que sol es 3.0 y luna es 9, se suma y se resta 1.0
- marte es 2, debido a que luna se decrementa en 1, es menor o igual a 8, se asigna 2

### 4. ¿Cuántas veces se imprime `true`?

```java
var s1 = "Kotlin";
var s2 = "Kotlin";
var s3 = "Ko".concat("tlin");
var s4 = s3.intern();
var sb1 = new StringBuilder();
sb1.append("Ko").append("tlin");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(s1 == s3);
System.out.println(s1 == s4);
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s1));
```

1. [ ] 1
2. [ ] 2
3. [ ] 3
4. [X] 4
5. [ ] 5
6. [ ] 6
7. [ ] No Compila

Respuesta: 4

### Explicación 4

- s1 y s2 apuntan al mismo objeto en el String Pool
- El metodo equals compara el contenido de los objetos, por lo que es true para s1 y s2
- s3 no apunta al mismo objeto en el String Pool que s1, por lo que es false
- s4 apunta al mismo objeto en el String Pool que s1, por lo que es true una vez que se ha internado
- sb1.toString() no apunta al mismo objeto en el String Pool que s1, por lo que es false
- sb1.toString().equals(s1) compara el contenido de los objetos, por lo que es true

--- 

## 5. El siguiente código aparece en un archivo llamado Vuelo.java. ¿Cuál es el resultado de compilar este archivo fuente?

```java
public class Vuelo {
  private Numero num;
  public Vuelo(Numero num) {
    this.num = num;
  }
}

public class Numero {
  public int valor;
  public String llave;
}
```


1. [X] El código se compila con éxito y se generan dos archivos de código de bytes: Vuelo.class y Numero.class.
1. [ ] El código se compila con éxito y se genera un archivo de código de bytes: Vuelo.class.
1. [ ] Se produce un error de compilación en la línea 2.
1. [ ] Se produce un error de compilación en la línea 4.
1. [ ] Se produce un error de compilación en la línea 7.