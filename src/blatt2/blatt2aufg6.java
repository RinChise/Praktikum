package blatt2;

import static de.hsa.prog.tools.Input.readInteger;
import static de.hsa.prog.tools.Input.readWord;

public class blatt2aufg6 {

    public static void main(String[] args) {

        int m = -0, y, c, w;

        int d = readInteger("Bitte Tag eingeben: ");
        String month = readWord("Bitte Monat eingeben: ");
        int year = readInteger("Bitte Jahr eingeben: ");

        switch (month) {
            case "März":
                m = 1;
                break;
            case "April":
                m = 2;
                break;
            case "Mai":
                m = 3;
                break;
            case "Juni":
                m = 4;
                break;
            case "Juli":
                m = 5;
                break;
            case "August":
                m = 6;
                break;
            case "September":
                m = 7;
                break;
            case "Oktober":
                m = 8;
                break;
            case "November":
                m = 9;
                break;
            case "Dezember":
                m = 10;
                break;
            case "Januar":
                m = 11;
                year--;
                break;
            case "Februar":
                m = 12;
                year--;
                break;
            default:
                System.out.println("Den eingegebenen Monat gibt es nicht.");
        }
        if (m != 0) {

            y = year % 100;
            c = year / 100;

            w = ((d + (int) (2.6 * m - 0.2) + y + (y / 4) + (c / 4) - 2 * c) % 7);

            //System.out.println(w);

            String[] wochentag = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};

            System.out.println(d + ". " + month + " " + year + " (" + wochentag[w] + ").");
        }
    }
}
