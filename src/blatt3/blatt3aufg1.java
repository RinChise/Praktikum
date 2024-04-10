package blatt3;

import static de.hsa.prog.tools.Input.*;

public class blatt3aufg1 {

    public static void main(String [] args){

        String word = readWord("Bitte Wort eingeben: ");

        //boolean b = word == "Programmieren"; //vergleicht ganzes Objekt nicht nur den Inhalt.

       boolean b = word.equals("Programmieren"); //vergleicht nur den Inhalt des Strings.

        System.out.println(b);
    }
}
