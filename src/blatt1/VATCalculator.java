package blatt1;

import static de.hsa.prog.tools.Input.readFloat;

public class VATCalculator {

    public static void main(String[] args) {
        float price;
        float steuer;

        price = readFloat("Bitte Netto-Preis eingeben: ");

        steuer = readFloat("Bitte Steuersatz (z.B. 0.19 für 19%) eingeben: ");

        float bruttoPreis = Math.round((price * (1 + steuer)) * 100.0f) / 100.0f;
        System.out.println("Nettopreis: " + price);
        System.out.println("Bruttopreis: " + bruttoPreis);

    }
}