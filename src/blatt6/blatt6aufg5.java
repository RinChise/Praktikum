package blatt6;

import static de.hsa.prog.tools.Input.*;

public class blatt6aufg5 {

    public static void main(String[] args) {
        int x = readInteger("Bitte x eingeben: ");
        int y = readInteger("Bitte y eingeben: ");

        int ggtResult = ggt(x, y);
        System.out.println("Der größte gemeinsame Teiler von " + x + " und " + y + " ist: " + ggtResult);
        // wenn ggt = 1 dann teilerfremd
    }

    public static int ggt(int x, int y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return ggt(x - y, y);
        } else {
            return ggt(x, y - x);
        }
    }
}

