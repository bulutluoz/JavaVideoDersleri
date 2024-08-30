package K02_DataVeVariableKullanimi;

public class C06_VariableNamingConvention {

    public static void main(String[] args) {

        int yas = 23;
        int YAS = 45;
        int YAs = 34;
        int yAs = 56;

        System.out.println(YAS); // 45
        // System.out.println(Yas); // Yas isminde bir variable yok


        // 2-
        int sayi_1 = 23;
        int sayi$_2 = 2;
        // int sayi 2 = 3;
        // int sayi# = 45;

        // 3-
        // String 2isim = "Ali ve ayse";
        short _sayi4 = 45; // tavsiye edilmez


        // 4-

        // int int = 43;
        // int class = 56;
        int int1 = 34;

        // variable isimleri kucuk harfle baslar,
        // barindirdigi bilgi ile uyumlu bir isim olmali
        // eger birden fazla kelimeden olusuyorsa
        // okumayi kolaylastirmak icin CamelCase kullanilmalidir

        double ogrenciYasi = 12;
        double sinifinNotOrtalamasi = 78.9;

    }
}
