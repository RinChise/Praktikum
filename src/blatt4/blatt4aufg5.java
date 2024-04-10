package blatt4;
import static de.hsa.prog.tools.Input.*;
import java.util.concurrent.ThreadLocalRandom;
public class blatt4aufg5 {

    public static void main(String[] args) {

        int a = readInteger("Größe Array: ");
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            arr[i] = randomNum;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        for (int k = 0; k < (arr.length/2); k++) {
            int temp = arr[k];
            arr[k] = arr[arr.length-k-1];
            arr[arr.length-k-1] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
}