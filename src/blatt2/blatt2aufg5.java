
package blatt2;

import static de.hsa.prog.tools.Input.*;

public class blatt2aufg5 {

    public static void main(String[] args) {

        int jahr = readInteger("Bitte Jahr eingeben: ");


        if ((jahr % 4 == 0) && (jahr % 100 == 0) && (jahr % 400 == 0)) {
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else if ((jahr % 4 == 0) && (jahr % 100 == 0)) {
            System.out.println(jahr + " ist kein Schaltjahr.");
        } else if (jahr % 4 == 0) {
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }
    }
}
