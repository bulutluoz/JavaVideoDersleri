package K08_ifElseStatements.D03_IfElseIfStatements;

import java.util.Scanner;

public class C05_CokluDegisken_Emeklilik {

    public static void main(String[] args) {
        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: erkek, K:kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        // kullanici kucuk buyuk harf girebilir diye
        // kontrolu kolay yapabilmek icin toUpperCase() kullandik

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if ( yas<15 || yas>80 || !(cinsiyet=='E' || cinsiyet == 'K')  ){
            System.out.println("Girilen degerler hatali");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Kadin 60 yasindan buyuk oldugundan emekli olabilir");
        } else if (cinsiyet == 'K' && yas<60) {
            System.out.println("Kadin, emekli olmak icin daha " + (60-yas) + " sene daha calismalidir");
        } else if (cinsiyet == 'E' && yas >=65) {
            System.out.println("Erkek 65 yasindan buyuk oldugundan emekli olabilir");
        } else if (cinsiyet =='E' && yas<65) {
            System.out.println("Erkek, emekli olmak icin daha " + (65-yas) + " sene daha calismalidir");

        }


    }
}
