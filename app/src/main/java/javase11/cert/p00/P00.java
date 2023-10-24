package javase11.cert.p00;

public class P00 {
    
    public static void main(String[] args) {
        p03();
    }

    private static void p03() {
        int luna = 9, estrella = 2 + 2 * 3;
        float sol = estrella > 10 ? 1 : 3;
        double júpiter = (sol + luna) - 1.0f;
        int marte = --luna <= 8 ? 2 : 3;
        System.out.println(sol + "-" + júpiter + "-" + marte);
    }
}
