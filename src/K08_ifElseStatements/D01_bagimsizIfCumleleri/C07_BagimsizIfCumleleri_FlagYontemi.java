package K08_ifElseStatements.D01_bagimsizIfCumleleri;

import java.util.Scanner;

public class C07_BagimsizIfCumleleri_FlagYontemi {

    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyin

        // girilen sayi1 ve sayi2 icin asagidaki sartlari kontrol edin
        // ve hic bir sarti saglamiyorsa "sayilar uygun degil" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 10;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1 < sayi2){
            System.out.println("birinci sayi daha kucuk");
            flag = 15;
        }
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 15;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 15;
        }
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"

        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 15;
        }


        // 5- EGER hic bir if body'si calismadiysa
        //    "sayilar uygun degil" yazdirin
        // sona geldiginde sadece 2 ihtimal var

        // eger 10 ise hic bir if body calismadi demektir

        if (flag == 10) System.out.println("sayilar uygun degil");

        // eger 15 ise if body'lerinden bazilari calisti
        // ama kac tanesi calisti bilmiyorum



    }
}
