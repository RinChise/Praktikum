package blatt6;

import java.util.Arrays;

public class blatt6aufg2 {

    public static void main(String[] args) {
        String text = "Bollu xyl Wixy zohencihcyln";
        //System.out.println(encrypt(convertStringCaesar(text), 20));
        System.out.println(decrypt(convertStringCaesar(text), 20));

        //char a = 'K';
        //System.out.println(encDecChar(a, 10, false));
        //System.out.print(Arrays.toString(convertStringCaesar(text)));
    }

    public static char[] convertStringCaesar(String text) {
        char[] array = text.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (!Character.isLetter(array[i])) {
                array[i] = ' ';
            }
        }
        return array;
    }

    public static char encDecChar(char c, int shiftAmount, boolean encrypt) {
        int alplength = 26;

        if (Character.isLetter(c)) {
            if (encrypt) {
                if (Character.isUpperCase(c)) {
                    c = (char) ((c - 'A' + shiftAmount) % alplength + 'A');
                    // c - A = um wie viel ich A verschieben muss um auf c zu kommen.
                    //H(75) - A(65) + shiftAmount(10) = 20 % 26 = 20 + 65 = 85 = U(85) genau 10 Zahlen von H entfernt
                } else {
                    c = (char) ((c - 'a' + shiftAmount) % alplength + 'a');
                }
            } else {
                shiftAmount = alplength - (shiftAmount % alplength);
                if (Character.isUpperCase(c)) {
                    c = (char) ((c - 'A' + shiftAmount) % alplength + 'A');
                } else {
                    c = (char) ((c - 'a' + shiftAmount) % alplength + 'a');
                }
            }
        } else {
            return c;
        }
        return c;
    }

    public static char[] encrypt(char[] array, int shiftAmount) {
        char[] newArray = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = encDecChar(array[i], shiftAmount, true);
        }
        return newArray;
    }

    public static char[] decrypt(char[] array, int shiftAmount) {
        char[] newArray = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = encDecChar(array[i], shiftAmount, false);
        }

        return newArray;
    }
}
