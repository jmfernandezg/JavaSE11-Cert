package javase11.cert.p00;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class P00 {

  public static void main(String... var) {
    p06();
  }

  private static void p06() {
    Set<String> conjunto = Set.of("mickey", "minnie");
    List<String> lista = new ArrayList<>(conjunto);
    conjunto.forEach(s -> System.out.println(s));
    lista.forEach(s -> System.out.println(s));

  }

  private static void p05() {
    int participantes = 4, animales = 2, artistas = -1;
    while((participantes = participantes+1) < 10) {
        System.err.println("participantes: " + participantes);

    } 
    System.err.println("participantes final: " + participantes);
    do {
        System.err.println("animales: " + animales);
    } while (animales++ <= 1);
    System.err.println("animales final: " + animales);

    for( ; artistas<2; artistas+=2) {
        System.err.println("artistas: " + artistas);
    }
    System.err.println("artistas final: " + artistas);

    System.out.println(participantes);
    System.out.println(animales);
    System.out.println(artistas);
  }

  private static void p03() {
    int luna = 9, estrella = 2 + 2 * 3;
    float sol = estrella > 10 ? 1 : 3;
    double júpiter = (sol + luna) - 1.0f;
    int marte = --luna <= 8 ? 2 : 3;

    var ardilla = new Object(); //3
    ardilla = ""; //6
    ardilla = 4; //6
    ardilla = false; //6
    ardilla = new Exception(); //6

    System.out.println(ardilla);
  }

  private static void p04() {
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
  }
}
