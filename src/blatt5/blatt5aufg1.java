package blatt5;

import java.util.Random;

public class blatt5aufg1 {

    public static void main(String[] args) {
        int[][][] dreiDimArray = new int[3][3][3];
        fillArray(dreiDimArray);
        printArray(dreiDimArray);
        System.out.println("Größter Wert(Indizes): " + findMaxValueIndiz(dreiDimArray));
        System.out.println("Größter Wert(For): " + findMaxValueFor(dreiDimArray));
    }

    public static void fillArray(int[][][] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) { //erste Dimension
            for (int j = 0; j < array[i].length; j++) { //zweite Dimension
                for (int k = 0; k < array[i][j].length; k++) { //dritte Dimension
                    int randomNumber = random.nextInt(9) + 1; //0-8 +1 = 1-9
                    array[i][j][k] = randomNumber;
                }
            }
        }
    }

    public static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int findMaxValueIndiz(int[][][] array) {
        int maxValue = Integer.MIN_VALUE; //größer oder gleich Wert = Maximum

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > maxValue) { //aktueller Wert an Position größer? als gespeicherte "maxValue"
                        maxValue = array[i][j][k];
                    }
                }
            }
        }
        return maxValue;
    }

    public static int findMaxValueFor(int[][][] array) {
        int maxValue = Integer.MIN_VALUE;

        for (int[][] subArray : array) {
            for (int[] innerArray : subArray) {
                for (int value : innerArray) {
                    if (value > maxValue) { //aktueller Wert größer? gespeicherter Wert
                        maxValue = value;
                    }
                }
            }
        }
        return maxValue;
    }
}
