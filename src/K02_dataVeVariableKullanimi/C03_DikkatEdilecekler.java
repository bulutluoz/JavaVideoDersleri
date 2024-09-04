package K02_dataVeVariableKullanimi;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {

        // 1- deklarasyon sadece 1 kere yapilir
        //    ama deger atamasi istediginiz kadar yapilabilir

        int sayi = 20;

        System.out.println( sayi ); // 20


        //int sayi = 30;
        // Variable 'sayi' is already defined in the scope
        int sayi2 = 30;

        System.out.println(sayi); // 20
        System.out.println(sayi2); // 30


        // 2- Java'da = isareti atama(assignment) isaretidir
        //    java = gordugunde once esitligin sol tarafindaki degeri hesaplar
        //    sonra bulunan degeri sol taraftaki variable'a atama yapar

        int yas = 23;

        yas = yas + 3 ;

        System.out.println("31.satirda yas degeri : " + yas);
        // 31.satirda yas degeri : 26


        yas = 2 * yas -5 ;


        System.out.println("40.satirda yas degeri : " + yas); // 40.satirda yas degeri : 47


        // 3- esitligin sol tarafinda SADECE variable olabilir

        // yas * 2 = 40; // Variable expected

        // 40 = 2 * yas; // Variable expected




    }
}
