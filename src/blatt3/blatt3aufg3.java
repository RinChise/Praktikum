package blatt3;
import static de.hsa.prog.tools.Input.*;
public class blatt3aufg3 {

    public static void main (String [] args){

        int a = readInteger("Variable a: ");
        int b = readInteger("Variable b: ");
        int c = readInteger("Variable c: ");

        System.out.println("Die Gleichung lautet: " + a + " * x² " + (b < 0 ? "- " : "+ ") + Math.abs(b) + " * x " + (c < 0 ? "- " : "+ ") + Math.abs(c) + " = 0");

        double diskriminante = b * b - 4 * a * c;
        if (diskriminante > 0) {
            double x1 = (-b + Math.sqrt(diskriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminante)) / (2 * a);

            System.out.println("Gleichung hat zwei reele Lösungen: ");
            System.out.printf(" x1 = %.2f\n", x1);
            System.out.printf(" x2 = %.2f\n", x2);
        } else if (diskriminante == 0) {
            double x = -b / (2.0 * a);
            System.out.println("Gleichung hat eine doppelte reelle Lösung: ");
            System.out.printf("x = %.2f\n", x);
        }else {
            System.out.println("Die Gleichung hat keine reellen Lösungen.");
        }
    }
}
