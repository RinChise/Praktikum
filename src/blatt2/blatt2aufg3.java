package blatt2;

import java.sql.SQLOutput;

import static de.hsa.prog.tools.Input.*;
public class blatt2aufg3 {

    public static void main(String[] args) {


        System.out.print("Bitte Alter eingeben: ");
        int age = readInteger();

        System.out.print("Bitte Größe in cm eingeben: ");
        int height = readInteger();

        System.out.print("Bitte Gewicht in Kilogramm eingeben: ");
        int kg = readInteger();

        //System.out.print("Bitte Aktivitätsfaktor eingeben: ");
        //float activ = readFloat();

        System.out.print("Sind sie eine Frau?(true oder false) ");
        boolean isWoman = readBoolean();

        System.out.print("Bitte Beruf eingeben: ");
        String profession = readWord();

        double activity;

        switch (profession) {
            case "Büroangestellte":
                activity = 1.45;
                break;
            case "Laboranten":
                activity = 1.6;
                break;
            case "Kraftfahrer":
                activity = 1.6;
                break;
            case "Fließbandarbeiter":
                activity = 1.65;
                break;
            case "Pflegepersonal":
                activity = 1.8;
                break;
            case "Kellner":
                activity = 1.8;
                break;
            case "Mechaniker":
                activity = 1.8;
                break;
            case "Handwerker":
                activity = 1.8;
                break;
            case "Bauarbeiter":
                activity = 2.0;
                break;
            case "Landwirte":
                activity = 2.0;
                break;
            case "Waldarbeiter":
                activity = 2.0;
                break;
            case "Bergarbeiter":
                activity = 2.0;
                break;
            case "Leistungssportler":
                activity = 2.4;
                break;
            default:
                activity = 0.0;
        }

        int a = ((int) (((10 * kg) + (6.25f * height) - (5 * age) -161) * activity));
        int b = ((int) (((10 * kg) + (6.25f * height) - (5 * age) +5) * activity));

        int result = (isWoman) ? a : b ;

        //int totalConsumptionWoman = (int) (((10 * kg) + (6.25f * height) - (5 * age) -161) * activ);
        //int totalConsumptionMan = (int) (((10 * kg) + (6.25f * height) - (5 * age) +5) * activ);

        System.out.println("Gesamtumsatz: " + result);
    }
}
