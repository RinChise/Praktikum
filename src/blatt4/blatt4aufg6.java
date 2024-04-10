package blatt4;

import java.util.concurrent.ThreadLocalRandom;

import static de.hsa.prog.tools.Input.readInteger;

public class blatt4aufg6 {

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

        int[] uniqueArray = removeDuplicates(arr);
        System.out.println("Array ohne doppelte: ");
        printArray(uniqueArray);

    }
    public static int[] removeDuplicates(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) { //vergleicht element mit nachfolgendem element
                if (arr[i] == arr[j]) {
                    for (int k = j; k < length - 1; k++) {
                        arr[k] = arr[k+1]; //verschiebt elemente nach links
                    }
                    length--;
                    j--; //verringert index um platz 0 neu zu prüfen
                }
            }
        }
        int[] uniqueArray = new int[length];
        for(int m = 0; m < length; m++) {
            uniqueArray[m] = arr[m];
        }
        return uniqueArray;

    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
