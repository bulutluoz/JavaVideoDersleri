package K05_wrapperClass_MatematikselIslemler_Concatenation;

public class C01_WrapperClass {
    public static void main(String[] args) {

        String str = "Java Candir";
        int sayi = 34;

        System.out.println(str.charAt(2)); // v
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candir


        // Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
        // WRAPPER CLASS'lari olusturmustur
        // boolean, char     , byte, short, int    , long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double


        // int sayi2 = (int)str;

        int sayi3 = 5;
        short sayi4 = 6;
        byte sayi5 = 7;

        Integer sayi6 = sayi3;
        // Integer sayi7 = sayi4;  // data turu primitive short , Integer class'a direk atanamaz

        int sayi8 = sayi4; // primitive data turlerin auto widening

        //Integer sayi9 = sayi5;  // primitive byte degeri  Wrapper class Integer'a atayamayiz
        Integer sayi9 = (int)sayi5;  // primitive'ler arasinda cast yapip, sonra atama yapabiliriz


        // primitive variable'lar ile ayni data turunun wrapper class'indaki variable'lar arasinda
        // gecis mumkundur


        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        System.out.println( fiyat1 + fiyat2 ); // 2345

        // Nutella 23$ ==> "23"

        int f1 = Integer.parseInt(fiyat1);
        int f2 = Integer.parseInt(fiyat2);

        System.out.println("Iki urunun toplam fiyati : " + (f1+f2)); // 68


        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768


        System.out.println(Integer.max(f1, f2)); // 45


        char chr = 's';

        // verilen karakterin Buyuk Harf olup olmadigini yazdirin

        System.out.println(Character.isUpperCase(chr)); // false

        // verilen karakterin Kucuk Harf olup olmadigini yazdirin
        System.out.println( Character.isLowerCase(chr) ); // true

        // verilen karakterin Sayi olup olmadigini yazdirin

        System.out.println(Character.isDigit(chr)); // false

        // verilen karakterin Harf olup olmadigini yazdirin
        System.out.println(Character.isLetter(chr)); // true

        // verilen karakterin Alfabetik olup olmadigini yazdirin
        System.out.println(Character.isAlphabetic(chr)); // true

        System.out.println(Character.toUpperCase(chr)); // S


    }
}
