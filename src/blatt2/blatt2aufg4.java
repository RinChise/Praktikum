package blatt2;

import static de.hsa.prog.tools.Input.*;
public class blatt2aufg4 {

    public static void main(String[] args){
        int a;
        int b;
        int c;

        System.out.print("Bitte erste Zahl eingeben: ");
        a = readInteger();

        System.out.print("Bitte zweite Zahl eingeben: ");
        b = readInteger();

        System.out.print("Bitte dritte Zahl eingeben: ");
        c = readInteger();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
