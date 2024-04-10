package blatt1;

public class NumberFormat {
    public static void main(String[] args) {
        int number = 1;
        int secondNumber = 2;
        System.out.format("Dies ist ein Text mit dem eine Zahl gedruckt wird: \"%d\"\n", number);
        System.out.format("Nochmal die gleiche Zahl mit führenden Leerzeichen: \"%4d\"\n", number);
        System.out.format("Nochmals die Zahl mit führenden Nullen: %04d\n", number);
        System.out.format("Und jetzt mehrere Zahlen: %06d und %08d\n", number, secondNumber);

        int hours=1;
        int minutes=2;
        int seconds=3;

        System.out.format("Aktuelle Uhrzeit:  %02d:%02d:%02d Uhr\n", hours, minutes, seconds);

        int x=18101;

        int hoursnew = x / 3600;
        int minutesnew= (x % 3600) / 60;
        int secondsnew= x % 60;

        System.out.format("Aktuelle Uhrzeit: %02d:%02d:%02d Uhr\n", hoursnew, minutesnew, secondsnew);

        int hoursA=14, minutesA=20, secondsA=33;
        int hoursB=14, minutesB=21, secondsB=21;

        int totalSecondsA=hoursA * 3600 + minutesA * 60 + secondsA;
        int totalSecondsB=hoursB * 3600 + minutesB * 60 + secondsB;
        int differenzSeconds = totalSecondsB - totalSecondsA;

        System.out.format("Zwischen %02d:%02d:%02d Uhr und %02d:%02d:%02d Uhr sind %d Sekunden vergangen.%n",
                hoursA, minutesA, secondsA, hoursB, minutesB, secondsB, differenzSeconds);
    }
}