package K11_stringManipulations.Ders03;

public class C04_indexOf {

    public static void main(String[] args) {

        String str = "cok calismam lazim, cok";

        // str "calis" iceriyor mu ?
        System.out.println(str.contains("calis")); // true

        // str "calis" ile mi basliyor ?
        System.out.println(str.startsWith("calis")); // false

        // str "calis" ile mi bitiyor?
        System.out.println(str.endsWith("calis")); // false

        // PEKIII bu "calis" cumlenin neresinde?
        System.out.println(str.indexOf("calis")); // 4





        // "cok calismam lazim, cok"
        // str'da kullanilan ilk 'a' nin index'i
        System.out.println(str.indexOf('a')); // 5

        // str'da kullanilan ilk "cok" un index'i
        System.out.println(str.indexOf("cok")); // 0

        // str'da kullanilan ilk " " in index'i
        System.out.println(str.indexOf(" ")); // 3







        // "cok calismam lazim, cok";

        // str'da kullanilan ilk 'a' nin index'inin 5 oldugu biliniyorsa
        // ikinci a'nin index'i nedir?
        System.out.println(str.indexOf("a", 5));
        // eger ikinci a'yi aramaya
        // birinci a'nin index'inden baslarsak
        // yine 1.a'yi bulur ve bize 5 yazdirir

        System.out.println(str.indexOf('a',6)); // 10

        // str'da kullanilan ilk "cok" un index'inin 0 oldugu biliniyorsa
        // ikinci cok'un index'i nedir?
        System.out.println(str.indexOf("cok", 1)); // 20




        // "cok calismam lazim, cok";

        // str'da kullanilan ilk "x" in index'i

        System.out.println(str.indexOf("x")); // -1


        /*
            indexOf() bize sayi dondurur
            ama oyle bir sayi vermeli ki biz olmadigini anlayalim

            Java aranan char veya String'i verilen metinde bulamazsa
            -1 sonucu verir
         */

        // str'da kullanilan ilk "Java" nin index'i

        System.out.println(str.indexOf("Java")); // -1


    }
}
