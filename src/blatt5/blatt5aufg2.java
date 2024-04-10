package blatt5;

import static de.hsa.prog.tools.Input.*;

public class blatt5aufg2 {

    public static void main(String[] args) {
        String input = readWord("Bitte Wort eingeben: ");

        char[] array = input.toCharArray();
        char[] lowerCaseArray = toLowerCase(array);
        boolean isPalindrom = checkPalindrom(lowerCaseArray);

        if (isPalindrom) {
            System.out.println("Der eingegebene String ist ein Palindrom.");
        } else {
            System.out.println("Der eingegebene String ist kein Palindrom.");
        }
    }

    public static char[] toLowerCase(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toLowerCase(array[i]);
        }
        return array;
    }

    public static boolean checkPalindrom(char[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   /* public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }*/
}
