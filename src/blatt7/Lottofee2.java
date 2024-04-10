package blatt7;

import java.util.Random;

public class Lottofee2 {

    private byte[] list = new byte[]{-1, -1, -1, -1, -1, -1, -1};
    private Random randomInt = new Random();

    public Lottofee2() {

        for (int i = 0; i < list.length; i++) {
            boolean testDuplicate = i == 6 ? false : true;// keine prüfung beim 7ten nötig
            int ceiling = i == 6 ? 10 : 50; // 7 bzw 6 heißt superzahl also ceiling nur 10 0/9
            byte n = (byte) randomInt.nextInt(ceiling);
            while (testDuplicate) {
                testDuplicate = false;
                for (int j : list) {
                    if (n == j) {
                        testDuplicate = true;
                        n = (byte) randomInt.nextInt(ceiling);
                        break;
                    }
                }
            }
            list[i] = n;
        }
    }

    public byte[] nextNumber() {

        return list;
    }

}
