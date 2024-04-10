package blatt3;
import static de.hsa.prog.tools.Input.*;
public class blatt3aufg2 {

    public static void main (String[] args){

       String word = readWord("Welche Form (Kreis, Rechteck, Quadrat, Dreieck)? ");

       switch (word) {
           case "Kreis":
               double r = readDouble("Größe vom Radius? ");
               double FlaecheKreis = Math.PI * Math.pow(r, 2);

               System.out.println("Fläche vom Kreis: " + Math.round(FlaecheKreis * 100.00) / 100.00);
               //System.out.printf("Fläche vom Kreis = %.2f\n", FlaecheKreis);
                break;

           case "Rechteck":
               double a = readDouble("Länge Seite a? ");
               double b = readDouble("Länge Seite b? ");

               double FlaecheRechteck = a * b;

               System.out.println("Fläche vom Rechteck: " + Math.round(FlaecheRechteck * 100.00) / 100.00);
               break;

           case "Quadrat":
               double c = readDouble("Länge Seite a? ");

               double FlaecheQuadrat = c * c;

               System.out.println("Fläche vom Quadrat: " + Math.round(FlaecheQuadrat * 100.00) / 100.00);
               break;

           case "Dreieck":
               double g = readDouble("Länge Grundseite? ");
               double h = readDouble("Länge Höhe? ");

               double FlaecheDreieck = (g * h) / 2;

               System.out.println("Fläche vom Quadrat: " + Math.round(FlaecheDreieck * 100.00) / 100.00);
               break;

           default:
               System.out.println("Falsche Form.");
        }
    }
}
