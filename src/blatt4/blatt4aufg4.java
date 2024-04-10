package blatt4;

import static de.hsa.prog.tools.Input.*;

import java.util.concurrent.ThreadLocalRandom;

public class blatt4aufg4 {

    public static void main(String[] args) {

        int a = readInteger("Größe Array: ");
        int temp = 0;
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
            arr[i] = randomNum;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");

        for (int k = 0; k < arr.length; k++) {
            temp += arr[k];
        }
        System.out.println("Summe vom Array: " + temp);
    }
}