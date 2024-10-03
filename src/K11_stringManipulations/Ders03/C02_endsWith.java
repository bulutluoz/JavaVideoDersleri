package K11_stringManipulations.Ders03;

public class C02_endsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // metin "zevkli" ile mi bitiyor ?
        System.out.println(str.endsWith("zevkli")); // true

        // metin "zevkli" iceriyor mu?
        System.out.println(str.contains("zevkli")); // true

        // metin "zevkli" ile mi basliyor?
        System.out.println(str.startsWith("zevkli")); // false

        // metin "zevkli" mi? (tum metin "zevkli" ile ayni mi)
        System.out.println(str.equals("zevkli")); // false


        // "Java ogrenmek cok zevkli";

        // metin "li" ile mi bitiyor ?
        System.out.println(str.endsWith("li")); // true

        // metin "evkli" ile mi bitiyor ?
        System.out.println(str.endsWith("evkli")); // true

        // metin "Java ogrenmek cok zevkli" ile mi bitiyor ?
        System.out.println(str.endsWith("Java ogrenmek cok zevkli")); // true

        // metin "" ile mi bitiyor ?
        System.out.println(str.endsWith("")); // true


    }
}
