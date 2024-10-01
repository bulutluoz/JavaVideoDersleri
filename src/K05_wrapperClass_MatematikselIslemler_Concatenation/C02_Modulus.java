package K05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C02_Modulus {


    public static void main(String[] args) {


        System.out.println( 25 / 4 ); // 6.25 ==> 6

        System.out.println( 234 / 10 ); // 23.4 ==> 23 birler basamagidaki rakami yok eder


        System.out.println( 25 % 4 ); // 1 25'in 4 ile bolumunden kalani verir

        System.out.println( 234 % 10 ); // 4 ==> bize birler basamagindaki rakami verir


        // kullanicidan bir tamsayi isteyin
        // girilen sayinin birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        System.out.println( "Girilen sayinin birler basamagi : "+ girilenSayi % 10 );

        // girilen sayinin cift olup olmadigini yazdirin

        System.out.println( girilenSayi % 2 ); // islem sonucu 0 ise sayi cifttir

        // girilen sayinin 5'e bolunup bolunmedigini yazdirin

        System.out.println( "Sayinin 5 ile bolumunden kalan : " + (girilenSayi%5));  // kalan 0 ise 5'e tam bolunur

        // girilen sayinin 3'un tam kati olup olmadigini yazdirin

        System.out.println( "Sayinin 3 ile bolumunden kalan : " + (girilenSayi%3)); // kalan 0 ise 3'un tam katidir

    }


}
