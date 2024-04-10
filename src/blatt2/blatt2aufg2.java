package blatt2;

public class blatt2aufg2 {

    public static void main(String[] args) {

        int a = 4, b = 0, c = 0;
        boolean d = true;
        float f1 = 0.0f;

        c = b = a = a * 4;

        //System.out.println(a + " " + b + " " + c);

        c = b= (a = 4) << 2;

        //System.out.println(a + " " + b + " " + c);

        int result = (a % 2 == 0) ? (b = a*2) : (b = a*4);

        //System.out.println(a + " " + b);

        if ( d == true && ((a+1)%5 == 0)) {}

        a = (d && (a +1) % 5 == 0) ? (a + 1) % 5 : (a + 1) % 5;

        f1 = ((a%10 == 0) && (b%10 == 0) ? a/3f : a*10 );

    }
}
