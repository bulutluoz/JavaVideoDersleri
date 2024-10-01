package K11_stringManipulations.Ders02;

public class C02_substring_IkiParametre {

    public static void main(String[] args) {

        String str = "Java ogrenen pisman olmaz...";

        System.out.println("karakter sayi : " + str.length() ); // 28

        // ilk kelime haric cumleyi yazdirin

        System.out.println(str.substring(5)); // ogrenen pisman olmaz...


        // sadece 2.kelimeyi yazdirin

        System.out.println(str.substring(5, 12)); // ogrenen


         /*
            substring (baslangicIndex) ==> baslangic index'inden baslayip metnin sonuna kadar yazdirir

            substring(basInd, bitInd) ==> baslangic index'i(dahil) ile bitis index'i (haric)
                                          arasinda kalan karakterleri yazdirir

            ONEMLI NOT : java'da genel olarak
                         baslangic index'leri DAHIL, bitis index'leri HARIC'tir
         */

        //           "Java ogrenen pisman olmaz..."


        System.out.println(str.substring(2, 4)); // va

        // sadece 3. harfi String olarak baska bir variable'a kaydedin

        String ucuncuKarakter = str.charAt(2)+"";  // v

        String ucuncuHarf = str.substring(2,3); // v

        // 2.harfi buyuk harfe cevirip yazdirin

        // str.charAt(1)
        System.out.println(str.substring(1, 2).toUpperCase()); // A


        /*
            charAt(2) method'u ile bir karakteri elde edebiliriz
            ANCAK charAt() bize char dondurdugu icin String Manipulation yapamayiz

            substring(2,3) bize harfi String olarak getirdigi icin
            hazir method'lari kullanabiliriz.
         */



        // baslangic ve bitis index'leri ayni olursa ...

        System.out.println(str.substring(3, 3));


        // baslangic index'i  bitis index'den buyuk olursa ...

        // System.out.println(str.substring(8, 4));
        // StringIndexOutOfBoundsException: begin 8, end 4, length 28


        // bastan 10 karakteri yazdirin

        System.out.println(str.substring(0, 10)); // Java ogren


        // 15.index'den baslayip, 8 karakter yazdirin

        System.out.println(str.substring(15, 23)); // sman olm

        // "Java ogrenen pisman olmaz...";
        // bastan 3.karakterden baslayip,
        // sondan 3.karaktere kadar(dahil) olan bolumu yazdirin

        System.out.println(str.substring(2, str.length() - 2));
        // va ogrenen pisman olmaz.


    }

}
