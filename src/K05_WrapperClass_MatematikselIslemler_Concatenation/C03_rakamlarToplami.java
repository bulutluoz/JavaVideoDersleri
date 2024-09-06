package K05_WrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C03_rakamlarToplami {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11


        Scanner scanner = new Scanner(System.in);

        System.out.println( "Lutfen 3 basamakli pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();
        int oAnkiBirlerBasamagi = 0;
        int rakamlarToplami=0;


        oAnkiBirlerBasamagi = sayi % 10;

        rakamlarToplami = rakamlarToplami + oAnkiBirlerBasamagi;

        sayi = sayi / 10;

        oAnkiBirlerBasamagi = sayi % 10;

        rakamlarToplami = rakamlarToplami + oAnkiBirlerBasamagi;

        sayi = sayi / 10;

        rakamlarToplami = rakamlarToplami + sayi;

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami );
















    }
}
