package blatt7;

public class blatt7aufg2 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int gesuchterWert = 8;

        int iterativeResult = binaryIterative(array, gesuchterWert);
        if (iterativeResult != -1) {
            System.out.println("Element gefunden (iterativ) an Index: " + iterativeResult);
        } else {
            System.out.println("Element nicht gefunden (iterativ).");
        }

        int recursiveResult = binaryRecursive(array, gesuchterWert, 0, array.length - 1);
        if (recursiveResult != 1) {
            System.out.println("Element gefunden (rekursiv) an Index: " + recursiveResult);
        } else {
            System.out.println("Element nicht gefunden (rekursiv).");
        }
    }


    public static int binaryIterative(int[] arr, int ziel) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == ziel) {
                return mid;
            } else if (arr[mid] < ziel) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binaryRecursive(int[] arr, int ziel, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == ziel) {
            return mid;
        } else if (arr[mid] < ziel) {
            return binaryRecursive(arr, ziel, mid + 1, right);
        } else {
            return binaryRecursive(arr, ziel, left, mid - 1);
        }
    }
}
