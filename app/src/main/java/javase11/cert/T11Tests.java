package javase11.cert;

public class T11Tests {
    
    public static void change(String in) {

    }


    // another stuff
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
