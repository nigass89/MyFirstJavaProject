import java.util.Arrays;
import java.util.List;

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
        /*
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
        */

        //boolean a = 4 > 1;
        //System.out.println(a);

        //boolean a = (3 > 5) || (9 > 10) || (10 > 5);
        //System.out.println(a);

        //int a = 3;
        //int b = 10;
        //System.out.println(a != b);

        //warunek ? rezultat1 : rezultat2;

        //String tekst = 10 > 15 ? "Więcej" : "Mniej";
        //System.out.println(tekst);

        /*
        String tekst;
        if (15 > 10){
            tekst = "Więcej";
        }
        else{
            tekst = "Mniej";
        }
        System.out.println(tekst);
        */
        /*
        String tekst;
        if (15 == 10){
            tekst = "Równy";
        }
        else if (15 > 20 ){
            tekst = "Większy";
        }
        else {
            tekst = "Mniejszy";
        }
        System.out.println(tekst);
        */
        /*
        int liczba = 20;
        if (liczba >= 0 && liczba <= 100){
            System.out.println("Liczba mieści się w przedziale od 0 do 100.");
            if (liczba > 20) {
                System.out.println("Liczba jest większa od 20.");
            }
            else if (liczba < 20){
                System.out.println("Liczba jest mniejsza od 20.");
            }
            else{
                System.out.println("Liczba jest równa od 20.");
            }
        }
        else{
            System.out.println("Liczba nie mieści się w przedziale od 0 do 100.");
        }
        */
        /*
        int liczba = 40;
        switch(liczba){
            case 30:{
                int a;
                System.out.println("liczba to 30");
                break;}
            case 40:
                int a;
                System.out.println("Liczba to 40");
                return;
            case 50:
            case 60:
                System.out.println("Liczba to 50 lub 60");
                break;
            default:
                System.out.println("Liczba to nie 30, 40, 50 lub 60");
                break;
        }
        System.out.println("koniec");
        */
        /*
        double a = 4;
        double b = 2;
        double c = -32.5;
        double d = 4.7;
        long result = Math.round(d);
        Math.ceil();
        Math.floor();

        System.out.println(result);
        */
        /*
        BigInteger a = BigInteger.valueOf(10000);
        BigInteger b = BigInteger.valueOf(5000);
        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);
        BigInteger e = a.divide(b);
        BigInteger f = a.subtract(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        */


        /*
        int a = 10;
        int b = 5;
        do{
            System.out.println("!");
            b++;
        } while (a > b)
        while (a > b){
            System.out.println("!");
            b++;
        }
        */
        //while(true);
        /*
        for(int index = 0;index<10;index ++){
            System.out.println(index + "!");
        }
        */
        /*
        List<String> lista = Arrays.asList("a", "b", "c");
        for(int index = 10; index > 0;index--){
            System.out.println(index + "!");
        }

        */

        List<String> lista = Arrays.asList("a", "b", "c");
        for (String string : lista){
            System.out.println(string);
        }
    }
}
