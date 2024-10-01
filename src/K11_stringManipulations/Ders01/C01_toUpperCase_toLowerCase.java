package K11_stringManipulations.Ders01;

import java.util.Locale;

public class C01_toUpperCase_toLowerCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // str'i kucuk harf olarak yazdirin

        System.out.println(str.toLowerCase()); // java candir


        /*
            method'lari kullanmak str'i kalici olarak degistirmez
            SADECE kullanildigi satir icin degistirir
         */

        // str 'i yazdiralim

        System.out.println( str); // Java Candir


        str.toUpperCase();
        /*
         yukardaki 27. satirda kod calisir
         AMMA yazdirma veya atama olmadigindan
         yaptigi islem 27.satirda kalir
         ne konsolda gorunur, ne de kalici bir degisiklik yapar
         */

        /*
        Kalici degisiklik yapmak istedigimizde ATAMA yapmaliyiz
         */

        // str'i kalici olarak buyuk harflerden olusan bir metne cevirin

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        /*
            Eger bir dilde herhangi bir harfin buyuk/kucuk harf degisimi
            latin alfabesinden farkli ise toUpperCase() veya toLowerCase() kullanirken
            Localle tercihi kullanilabilir.

            ornegin str'i kucuk harfe cevirirsek,
            ingilizce alfabe kullandigi icin CANDIR ==> candir olur
            Eger I'yi toLowerCase() yaptigimizda turkce kucuk ı olmasini istersek
            Locale tercihi kullanabiliriz
         */

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str.toLowerCase(Locale.CHINA)); // java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır




    }
}
