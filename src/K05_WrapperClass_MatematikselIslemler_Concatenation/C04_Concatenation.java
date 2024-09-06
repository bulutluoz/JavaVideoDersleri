package K05_WrapperClass_MatematikselIslemler_Concatenation;

public class C04_Concatenation {

    public static void main(String[] args) {

        // Bir String ile herhangi bir primitive data turundeki degeri + toplarsak
        // Java String'in yanina geleni de String'lestirir

        System.out.println( "Java" + 4);  // "Java4"

        System.out.println( "Java" + 4 + 5); // "Java4" + 5 ==> Java45

        System.out.println( 4 + 5 + "Java"); // 9 + "Java" ==> "9Java"

        System.out.println( "Java" + 4 * 5 ); // "Java" + 20 ==> "Java20"


        // String'de + islemi CONCATENATION (birlestirme) demektir
        // + disinda hicbir matematiksel islem String ile kullanilamaz

//        System.out.println( "Java" * 5);
//        System.out.println( "Java" - 3);
//        System.out.println( "Java" / 5);



        // Sadece verilen variable'lari kullanarak
        // istenen String'leri yazdirin

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";

        int a = 3;
        int b = 4;

        // 12 Java Candir
        System.out.println( a*b+s2+s1+s2+s3); // 12 Java Candir

        // 7 Java
        System.out.println( a+b+s2+s1); // 7 Java

        // 34 Candir
        // 3 ve 4'un toplama yerine birlestirilmesini istiyor
        // birlestirme olmasi icin bu sayilari String'lestirmeliyiz

        System.out.println( a + b + s2 + s3); // 7 Candir
        System.out.println( a +s2+ b + s2 + s3); // "3 " + 4 ==> 3 4 Candir
        System.out.println( a +s4+ b + s2 + s3); // 34 Candir

        // Java12Candir

        // Java34candir


        String str3 = 5 + "";

        String str4 = "" + true;

        String str5 = 's' + "";



    }
}
