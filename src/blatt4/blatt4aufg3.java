package blatt4;

import static de.hsa.prog.tools.Input.*;

public class blatt4aufg3 {

    public static void main(String[] args) {

        int zahl = readInteger("Bitte Zahl eingeben: ");

        int quer, i, rest;
        quer = 0;
        i = zahl; //speichere wert zahl vor bevor ich rechne

        while (zahl > 0) {
            rest = zahl % 10; //rest von zahl zb 4711 = 1
            quer = quer + rest; // 0 + 1 wird vorgemerkt
            zahl = zahl / 10;   //die nächste stelle wird "vorgemerkt" 4711 wird zu 471.
        }
        System.out.println("Die Quersumme von " + i + " ist: " + quer);
    }
}

