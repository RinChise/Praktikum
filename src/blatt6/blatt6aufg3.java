package blatt6;

import static de.hsa.prog.tools.Input.*;

public class blatt6aufg3 {

    public static void main(String[] args) {
        long input = (long) readDouble("Bitte Zahl eingeben? ");

        System.out.println("Fakultät " + isFactorial(input));
    }


    public static long isFactorial(long i) {
        long factorial = 1;
        int factor = 1;

        while (factorial < i) {
            factor++;
            factorial *= factor;
        }

        if (factorial == i) {
            return factor;
        } else {
            return -1;
        }
    }
}
