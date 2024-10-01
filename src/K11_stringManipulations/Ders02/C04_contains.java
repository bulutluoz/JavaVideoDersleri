package K11_stringManipulations.Ders02;

public class C04_contains {

    public static void main(String[] args) {

        String str = "Hayatin her asamasinda Java kullanilir.";

        /*
            Verilen bir String'in istenen bir harf
            veya metni icerip icermedigini kontrol etmek icin kullanilir
         */

        System.out.println(str.contains("a")); // true

        System.out.println(str.contains("H")); // true

        /*
           contains method'u aranan harf veya metnin kac kere kullanildigi ile ILGILENMEZ
         */


        // Hayatin her asamasinda Java kullanilir.

        /*
             contains method'u aradigi metni case sensitive olarak
             ve metinde kullanildigi sekilde arar
         */

        System.out.println(str.contains("k")); // true

        System.out.println(str.contains("her")); // true

        System.out.println(str.contains("r a")); // true

        System.out.println(str.contains("ra")); // false

        System.out.println(str.contains("H y")); // false

        System.out.println(str.contains("A")); // false

        System.out.println(str.contains("Java")); // true

        System.out.println(str.contains("java")); // false





        /*
            contains() char parametre kabul etmez
         */



    }
}
