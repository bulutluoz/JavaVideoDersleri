package K03_ScannerKullanimi;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //        asagidaki formatta yazdirin.
        //		    Isminiz : John
        //		    Soyisminiz : Doe
        //		    Yasiniz : 44
        //		    Kaydiniz basariyla tamamlanmistir.

    Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz....");
        // String isim = scanner.next();   // Java ilk space'e kadar olan kismi alir
                                           // ornegin kullanici Ali Mert girerse sadece "Ali"'yi alir
        String isim = scanner.nextLine(); // butun satiri alir

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        System.out.println(

               "Isminiz : " +  isim + "\n"+
               "Soyisminiz : "  + soyisim +
               "\nYasiniz : " + yas +
               "\nKaydiniz basariyla tamamlanmistir."
        );



























    }
}
