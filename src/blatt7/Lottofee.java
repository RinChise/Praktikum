package blatt7;
import java.util.Random;
public class Lottofee {

    private int triesLeft = 7;
    private byte[] list = new byte[7]; // Speicher für Zahlen da von 0 - 49
    private Random randomInt = new Random();

    public byte nextNumber() {
        if (triesLeft > 0) {
            boolean testDuplicate;
            int ceiling;

            if (triesLeft == 1) { //triesLeft 1 = Superzahl
                testDuplicate = false; //false weil Superzahl von 0 - 9 ist, deshalb ceiling 10
                ceiling = 10;
            } else {
                testDuplicate = true;
                ceiling = 50;
            }

            byte n = (byte) randomInt.nextInt(ceiling); //Zufallszahl 0 bis ceiling

            while (testDuplicate) {
                testDuplicate = false;
                for (byte i : list) {
                    if (n == i) { //wenn n in der liste ist wird neue Zahl generiert
                        testDuplicate = true;
                        n = (byte) randomInt.nextInt(ceiling);
                        break;
                    }
                }
            }

            list[7 - triesLeft] = n;
            triesLeft--;
            return n;
        }
        return -1;
    }
}