package blatt7;
import static de.hsa.prog.tools.Input.*;

public class blatt7aufg3 {

    public static void main(String[] args) {
    int input = readInteger("Bitte Grenze angeben: ");
    int[] prim = siebEratosthenes(input);

        System.out.println("Primzahlen kleiner oder gleich " + input + ":");
        for(int num : prim) {
            System.out.print(num + " ");
        }
    }

    public static int[] siebEratosthenes(int n) {
        boolean[] isPrim = new boolean[n + 1];
        for(int i = 0; i <= n; i++) {
            isPrim[i] = true;
        }
        //Streiche Vielfache von j
        for(int j = 2; j <= n; j++) {
            if(isPrim[j]) {
                for(int i = 2 * j; i <= n; i += j) { //alle vielfachen von 2 = false
                    isPrim[i] = false;
                }
            }
        }
        //Zähle Prim Anzahl für Array Größe
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if (isPrim[i]) {
                count++;
            }
        }

        //Erstelle und fülle neues Array
        int[] prim = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if(isPrim[i]) {
                prim[index] = i;
                index++;
            }
        }
        return prim;
    }
}
