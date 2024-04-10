package blatt7;

public class blatt7aufg1 {
    public static void main(String[] args) {
        int[] array = {5, 20, 30, 102, 495, 7, 11, 33, 22, 60, 40};

        System.out.println("(Iterativ) Anzahl der ungeraden Zahlen: " + iterativArray(array));
        System.out.println("(Rekursiv) Anzahl der ungeraden Zahlen: " + rekursivArray(array, 0));
    }

    public static int iterativArray(int[] array) {
        int count = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int rekursivArray(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return 0;
        }

        if (array[index] % 2 != 0) {
            return 1 + rekursivArray(array, index + 1);
        } else {
            return rekursivArray(array, index + 1);
        }
    }
}

