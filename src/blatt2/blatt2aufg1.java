package blatt2;

public class blatt2aufg1 {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i > 100);
        //False weil i = 10 und dementsprechend kleiner als 100
        System.out.println(i % 5 == 1 || i++ == 10);
        //das erste ist False weil Modulo = 0 durch ODER ( || ) stimmt das zweite aber da i erst nach dem Print erst 11 wird also True
        System.out.println(i > 5 || i == 12);
        //True weil 11 Größer als 5
        System.out.println(i == 11);
        //True weil i = 11
        System.out.println(i << 1);
        //22 weil i=11 Binär = 1011. durch << wird es binär um eins nach links verschieben = 10110 = 22
        System.out.println(i);
        //11 weil << ohne Zuweisung i = i << 1 das wäre dann 22
        System.out.println(Integer.MAX_VALUE + 1 > 0 && ++i > 1);
        // der erste Ausdruck ist FALSE weil MAX_VALUE +1 gewrappt auf -2,147,483,648 > 0. Da der erste Ausdruck FALSE wird der zweite ignoriert wegen &&
        System.out.println(i);
        // i = 11 weil das ++i vorher ignoriert wurde wegen dem FALSE davor
    }
}
