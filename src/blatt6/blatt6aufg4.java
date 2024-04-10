package blatt6;

import static de.hsa.prog.tools.Input.*;

public class blatt6aufg4 {

    public static void main(String[] args) {
        int basis = readInteger("Bitte Basis eingeben: ");
        int exponent = readInteger("Bitte Exponent eingeben: ");

        //int ergebnis = potenzDoWhile(basis, exponent);
        //int ergebnis = potenzWhile(basis, exponent);
        int ergebnis = potenzRekursiv(basis, exponent);

        if (ergebnis != -1) {
            System.out.println(basis + " hoch " + exponent + " = " + ergebnis);
        }
    }

    public static int potenzDoWhile(int x, int n) {
        if (n < 0) {
            System.out.println("Exponent muss größer/gleich 0 sein.");
            return -1;
        }
        //b) Ausnahme wenn Potenz 0 ist soll immer 1 rauskommen.
        if (n == 0) {
            return 1;
        }

        int potenz = 1;
        int i = 0;

        if (n > 0) {
            do {
                potenz *= x;
                i++;
            } while (i < n);
        }
        return potenz;
    }

    public static int potenzWhile(int x, int n) {
        if (n < 0) {
            System.out.println("Exponent muss größer/gleich 0 sein.");
            return -1;
        }

        int potenz = 1;
        int i = n;

        while (i > 0) {
            potenz *= x;
            i--;
        }

        return potenz;
    }

    public static int potenzRekursiv(int x, int n) {

        return potenzRekursivD(x, n, 1);
    }

    public static int potenzRekursivD(int x, int n, int value) {
        if (n == 0)
            return 1;
        if (n == 1)
            return value * x;
        return potenzRekursivD(x, n - 1, value * x);



      /*  if (n == 0) {
            return 1;
        } else if ( n < 0 ){
            return -1;
        } else if (n == 1) {
            return x;
        } else {
            return x * potenzRekursiv(x, n - 1); //x * x * meth
        } */
    }
}
