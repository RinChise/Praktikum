package blatt3;
import static de.hsa.prog.tools.Input.*;
public class blatt3aufg4 {

    public static void main(String[] args) {

        int betrag = readInteger("Bitte Betrag angeben: ");

        int[] scheine = {500, 200, 100, 50, 20, 10, 5};
        int[] anzahlScheine = new int[scheine.length];

        for (int i = 0; i < scheine.length; i++) {
            anzahlScheine[i] = betrag / scheine[i];
            betrag = betrag % scheine[i];
        }

        System.out.println("Minimale Anzahl an Scheinen: ");

        for (int i = 0; i < scheine.length; i++) {
            System.out.printf("%d-Euro Scheine: %d\n", scheine[i], anzahlScheine[i]);
        }
    }
}
