package blatt7;

public class LottofeeTest {
    public static void main(String[] args) {
        Lottofee lottofee1 = new Lottofee();
        Lottofee lottofee2 = new Lottofee();
        Lottofee2 lottofee3 = new Lottofee2();

        System.out.println("Ziehung mit Lottofee 1:");
        for (int i = 0; i < 7; i++) {
            byte number = lottofee1.nextNumber();
            System.out.println("Lottozahl: " + number);
        }

        System.out.println("\nZiehung mit Lottofee 2:");
        for (int i = 0; i < 7; i++) {
            byte number = lottofee2.nextNumber();
            System.out.println("Lottozahl: " + number);
        }

        System.out.println("\nZiehung mit Lottofee 3:");
        for( int i : lottofee3.nextNumber()) {
            System.out.println("Lottozahl: " + i );
        }
    }
}
