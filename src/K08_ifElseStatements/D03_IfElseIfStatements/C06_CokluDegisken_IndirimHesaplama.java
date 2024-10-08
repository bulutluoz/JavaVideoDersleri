package K08_ifElseStatements.D03_IfElseIfStatements;

import java.util.Scanner;

public class C06_CokluDegisken_IndirimHesaplama {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // asagidaki indirimleri de gozonunde tutarak toplam fiyati yazdirin
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen urun adedi giriniz...");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urunun indirimsiz fiyatini girin...");
        double urunFiyati = scanner.nextDouble();

        double indirimsizToplamFiyat = urunFiyati*urunAdedi;

        System.out.println("Musteri kartiniz var mi ? E: Evet H: Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);


        if (kartVarMi =='E' && urunAdedi >=10){
            System.out.println("%20 indirimli fiyat : " + indirimsizToplamFiyat * 80/100);
        } else if (kartVarMi == 'E' ) { // && urunAdedi<10
            System.out.println("%15 indirimli fiyat : " + indirimsizToplamFiyat * 85/100);
        } else if (kartVarMi == 'H' && urunAdedi>=10) {
            System.out.println("%15 indirimli fiyat : " + indirimsizToplamFiyat * 85/100);
        } else if (kartVarMi == 'H' ) { // && urunAdedi<10
            System.out.println("%10 indirimli fiyat : " + indirimsizToplamFiyat * 90/100);
        }


    }
}
