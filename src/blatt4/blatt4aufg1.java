package blatt4;

import static de.hsa.prog.tools.Input.*;

public class blatt4aufg1 {

    public static void main(String[] args) {

        int n = readInteger("Zahl eingeben? ");

        System.out.println("Fakultät von " + n + " (For-Schleife): " + facfor(n));
        System.out.println("Fakultät von " + n + " (While-Schleife): " + facwhile(n));
        System.out.println("Fakultät von " + n + " (DoWhile-Schleife): " + facdowhile(n));
        System.out.println("Die größte Zahl für int-Fakultät: " + maxfac());
    }

    public static int facfor(int n) {
        int fact = 1, i = 1;

        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int facwhile(int n) {
        int fact = 1, i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static int facdowhile(int n) {
        int fact = 1, i = 1;

        do {
            fact *= i;
            i++;
        } while (i <= n);
        return fact;
    }

    public static int maxfac() {
        int fact = 1, n = 1;

        while (true) {
            int prevfact = fact;
            fact *= n;
            if (fact / n != prevfact) {
                break;
            }
            n++;
        }
        return n - 1;
    }
}
