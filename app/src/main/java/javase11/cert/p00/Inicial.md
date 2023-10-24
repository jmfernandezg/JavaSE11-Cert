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

### Explicación:

La línea 7 intenta crear una instancia de la clase `Puma`, que es una clase abstracta y no se puede instanciar directamente. Por lo tanto, el código no se compilará debido a esta línea. Las otras opciones no son relevantes porque el código no llega a ejecutarse.


## 3. ¿Cuál es la salida del siguiente programa?

```java

int luna = 9, estrella = 2 + 2 * 3;
float sol = estrella > 10 ? 1 : 3;
double júpiter = (sol + luna) - 1.0f;
int marte = --luna <= 8 ? 2 : 3;
System.out.println(sol + "-" + júpiter + "-" + marte);

```

1. [ ] 1-11-2
1. [ ] 3.0-11.0-2
1. [X] 1.0-11.0-3
1. [ ] 3.0-13.0-3
1. [ ] 3.0f-12-2
1. [ ] El código no compila