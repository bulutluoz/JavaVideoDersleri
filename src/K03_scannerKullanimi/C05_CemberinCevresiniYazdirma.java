package K03_scannerKullanimi;

import java.util.Scanner;

public class C05_CemberinCevresiniYazdirma {

    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //         cevresini ve alanini yazdirin.
        //         cevre = 2* PI * yaricap , alan = PI * yaricap * yaricap


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz...");
        double yaricap = scanner.nextDouble();

        System.out.println(

                "Cemberin cevresi : " + ( 2* 3.14 * yaricap  ) +
                "\nDairenin alani : " +  (3.14 * yaricap * yaricap)
        );



    }
}
