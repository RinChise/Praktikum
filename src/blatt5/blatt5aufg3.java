package blatt5;

public class blatt5aufg3 {


    public static void main(String[] args) {
        int[] heightProfile = {0, 1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 6, 5, 5, 5, 4, 3, 2, 1, 0};

        int maxHeight = determineMaxHeight(heightProfile);
        char[][] drawing = createDrawing(heightProfile, maxHeight);
        drawHeightProfile(drawing, heightProfile, maxHeight);
        displayHeightProfile(drawing);
    }

    // Methode zur Bestimmung der maximalen Höhe des Berges
    public static int determineMaxHeight(int[] heightProfile) {
        int maxHeight = Integer.MIN_VALUE;
        for (int height : heightProfile) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }

    // Methode zur Erstellung des 2D-Arrays für die Zeichnung
    public static char[][] createDrawing(int[] heightProfile, int maxHeight) {
        int length = heightProfile.length;
        char[][] drawing = new char[maxHeight + 1][length];

        // Initialisierung des 2D-Arrays mit Leerzeichen
        for (char[] row : drawing) {
            for (int j = 0; j < length; j++) {
                row[j] = ' ';
            }
        }
        return drawing;
    }

    // Methode zur Bestimmung des nächsten Zeichens basierend auf den Höhenwerten
    public static char determineNextCharacter(int[] heightProfile, int index) {
        int currentHeight = heightProfile[index];
        int nextHeight = index < heightProfile.length - 1 ? heightProfile[index + 1] : -1;

        if (nextHeight > currentHeight) {
            return '/';
        } else if (nextHeight < currentHeight) {
            return '\\';
        } else {
            return '-';
        }
    }

    // Methode zum Zeichnen des Höhenprofils in das 2D-Array
    public static void drawHeightProfile(char[][] drawing, int[] heightProfile, int maxHeight) {
        int length = heightProfile.length;
        for (int i = 0; i < length; i++) {
            int height = heightProfile[i];
            drawing[maxHeight - height][i] = determineNextCharacter(heightProfile, i);
        }
    }

    // Methode zur Ausgabe des Höhenprofils
    public static void displayHeightProfile(char[][] drawing) {
        for (char[] row : drawing) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
