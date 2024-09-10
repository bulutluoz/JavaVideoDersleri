package K06_increment_decrement;

public class C01_Increment_Decrement {

    public static void main(String[] args) {


        int sayi = 20;

        System.out.println("10.satirda sayi : " + sayi); // 20

        // sayi variable'inin degerini 10 artirin

        // sayi = sayi + 10 ;
        sayi +=  10;

        System.out.println("17.satirda sayi : " + sayi); // 30


        // sayi variable'inin degerini 3 katina cikarin

        // sayi = sayi * 3 ;
        sayi *= 3;


        System.out.println("26.satirda sayi : " + sayi); // 90


        sayi++;

        System.out.println("31.satirda sayi : " + sayi); // 91

        sayi--;
        sayi--;
        sayi--;

        System.out.println("37.satirda sayi : " + sayi); // 88

        // sayi++  sayiyi 1'le topla
        // sayi-- sayidan 1 cikar
        // sayi**; sayiyi 1 ile carp  KULLANILMAZ
        // sayi//; sayiyi 1'e bol KULLANILMAZ
    }
}
