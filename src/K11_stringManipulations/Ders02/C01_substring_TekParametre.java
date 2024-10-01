package K11_stringManipulations.Ders02;

public class C01_substring_TekParametre {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.length()); // 30

        // 12.karakteri yazdirin

        System.out.println(str.charAt(11)); // c


        // 10.karakterden baslayip, sona kadar butun metni yazdirin
        System.out.println(str.substring(9)); // gectikce guzellesiyor


        // ilk kelime haric geriye kalan metni yazdirin  "gun gectikce guzellesiyor"

        System.out.println(str.substring(5)); // gun gectikce guzellesiyor




        // ilk harf haric, kalan metni yazdirin

        System.out.println(str.substring(1)); // ava gun gectikce guzellesiyor

        // sondan 5. karakteri yazdirin

        System.out.println(str.charAt(str.length() - 5)); // s


        // son 5 karekteri yazdirin // siyor

        System.out.println(str.substring(str.length() - 5)); // siyor


        // charAt() ve substring() method'lari farkli sonuclar verebilir
        // length 30 , son harfin index'i 29


        // "Java gun gectikce guzellesiyor";
        // son karakteri charAt() ile yazdirin
        System.out.println(str.charAt(str.length() - 1)); // r

        // son karakteri substring() ile yazdirin
        System.out.println(str.substring(str.length() - 1)); // r


        // index olarak str.lengt()'i kullanarak
        // charAt() ve substring'i kullanalim

        //System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length())); //


        /*
           System.out.println(str.charAt(str.length()));
           son harfin index'i length()-1 idi
           son harf olan r'den sonraki karakter deyince StringIndexOutOfBoundsException verir

           ama substring(str.length()) farkli davranir
           son harf olan r den sonraki herseyi yazdir demis gibi oluruz
           r'den sonra hicbirsey olmadigindan
           bu komut bize HICLIK yazdirir (bos bir satir)
         */



        // index olarak str.length()'den buyuk bir deger kullanarak
        // charAt() ve substring'i kullanalim

        //System.out.println(str.charAt(35)); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(35)); // StringIndexOutOfBoundsException

        // System.out.println(str.charAt(str.length() + 13)); // StringIndexOutOfBoundsException
        // System.out.println(str.substring(str.length() + 14)); // StringIndexOutOfBoundsException

        /*
          index olarak str.lengt()'den buyuk bir deger kullanirsak
          hem charAt() hem de substring() hata verir
         */

    }
}
