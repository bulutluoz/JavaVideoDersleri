package K11_stringManipulations.Ders03;

public class C01_startsWith {

    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyor ?
        System.out.println(str.startsWith("Java")); // true

        // str J ile mi basliyor ?
        System.out.println(str.startsWith("J")); // true

        // str Ja ile mi basliyor ?
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.startsWith("Ka")); // false

        // str "Java cok" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok")); // true
        System.out.println(str.startsWith("Java yok")); // false


        // str "j" ile mi basliyor ?
        System.out.println(str.startsWith("j")); // false




        // "Java cok guzel";

        // str "Java cok guzel" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok guzel")); // true

        // str "" ile mi basliyor ?
        System.out.println(str.startsWith("")); // true

        // str " Java" ile mi basliyor ?
        System.out.println(str.startsWith(" Java")); // false




        // "Java cok guzel"

        // 5.index ve sonrasi "cok" ile mi basliyor ?  // cok guzel ==> true
        System.out.println(str.startsWith("cok", 5)); // cok guzel ==> true

        // 8.index ve sonrasi " " ile mi basliyor ?
        System.out.println(str.startsWith(" ", 8)); // " guzel" ==> true








    }
}
