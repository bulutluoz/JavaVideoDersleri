package K11_stringManipulations.Ders01;

public class C02_charAt {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // str'in ilk harfini yazdirin

        System.out.println(str.charAt(0)); // J



        // str'daki bastan 9.harfi yazdirin

        System.out.println(str.charAt(8)); // e


        // son harfi yazdirin

        System.out.println( str.charAt(12)); // r

        // str'da 13 karakter bulunmaktadir

        System.out.println(str.charAt(  13 - 1   )); // r

        // sondan 3. harfi yazdirin
        System.out.println(  str.charAt( 13-3 )   ); // d

        // sondan 5. harfi yazdirin
        System.out.println( str.charAt(13-5)); // e




        /*
            charAt() ile son harfin index'inden buyuk bir sayi kullanildiginda
            Java StringIndexOutOfBounds (Verilen index String'in sinirlari disinda) hatasi verir
         */


        System.out.println(str.charAt(15));
        // StringIndexOutOfBoundsException
        // String index out of range: 15

        /*
            Java compile time'da degerlerle ilgilenmez
            syntax(yazim bicimi)'ni kontrol eder

            calismaya basladiktan sonra 15.index'i istedigimizi anlar
            ve 15.index olmadigi icin
            Run Time'da exception verir
         */


    }
}
