package blatt6;

public class ArrayContains {

    public static boolean arrayContains(int[] array1, int[] array2) {

        for (int num : array2) {
            boolean contains = false;
            for (int value : array1) {
                if (num == value) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {3, 4, 5};

        boolean result = arrayContains(firstArray, secondArray);

        System.out.println("Enthält das erste Array alle Elemente des zweiten Array?  " + result);
    }
}
