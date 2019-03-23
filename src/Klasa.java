public class Klasa {
    /*
    *Ta metoda wyświetla
    * 2 razy napis "Hello world!"
     */
    public static void main(String [] arguments){
        /*
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        int liczba = 38;
        System.out.println(liczba);
        */
        /* Prymitywne typy danych:
        * boolean
        * char
        * byte od -128 do 127
        * short -32 768 do 32 767
        * int
        * long
        * float zmiennoprzecinkowe e=0.2f dodajemy na koniec "F" żeby odróżnić od double
        * double zmiennoprzecinkowe c=0.3d dodajemy na koniec "d" żeby odróżnić od float
        */

        /* Obiektowe typy danych:
        * String
        * Integer
        * Byte
        *
        *
         */
        /*
        String abc = "  ania ma kota  ";
        String cba = "Jola ma psa";
        System.out.println(abc.concat(cba));
        System.out.println(abc.replace("ania", "kuba"));
        System.out.println(abc.toLowerCase());
        System.out.println(cba.toUpperCase());
        System.out.println(abc.trim());
        System.out.println(cba.substring(3));
        */

        //int a = 25;
        //double b = 10;
        //System.out.println((int)(a / b ));

        //double a = 17;
        //double b = 4;
        //double c = a / b;
        //System.out.println(c);

        //int rezultat = 2 + 2 * 4 - 3/10;
        //System.out.println(rezultat);

        int a =10;
        int b = 5;
        int c = 4;
        int d = 6;
        int e = 9;
        a += 1;
        b -= 1;
        c *= 2;
        d /= 3;
        e %= 4;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
