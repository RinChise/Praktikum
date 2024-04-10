package blatt4;
import static de.hsa.prog.tools.Input.*;

public class blatt4aufg2 {

    public static void main (String [] args){

        int h = readInteger("Höhe des Tannenbaumes: ");

        for(int i = 0; i < h; i++){
            for (int j = 0; j < h -i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l = 0; l < h; l++){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
