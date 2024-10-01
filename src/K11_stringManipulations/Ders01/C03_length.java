package K11_stringManipulations.Ders01;

import java.util.Scanner;

public class C03_length {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // ve girilen metinde kac karakter kullanildigini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir mnetin giriniz..");
        String str = scanner.nextLine(); // Java Guzeldir.

        // girilen metnin son karakterini yazdirin

        System.out.println(str.length()); // 14


        /*

            1- Karakter sayisi = son harfin index'i + 1
               son harfin index'i = length -1

            2- charAt(index) kullanirken length() degerini veya daha buyuk bir sayiyi kullanirsak
               Java StringIndexOutOfBoundsException verir

            3- bastan 5. karakter icin  str.charAt(5-1)
               sondan 5. karakter icin str.charAt( str.length() - 5 ) kullanilir

         */

        // Java Guzeldir.

        // bastan 3.karakteri yazdirin
        System.out.println(str.charAt(2)); // v


        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(14 - 3)); // i

        System.out.println(str.charAt(str.length() - 3)); //


        // metindek bastan 2. ve sondan 3. karakterleri yan yana yazdirin

        System.out.println(

                ""+ str.charAt(1) + str.charAt( str.length()-3)

        ); // ai



    }
}
