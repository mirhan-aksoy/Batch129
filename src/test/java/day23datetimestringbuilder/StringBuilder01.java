package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
        Java'da String, "String Class" kullanilarak veya "StringBuilder Class" kullanilarak olusturulabilir.
        "String Class" kullanarak urettiginiz String'ler "Immutable"(Degistirilemez) dir.
        "StringBuilder Class" kullanarak urettiginiz String'ler "Mutable"(Degistirilebilir) dir.
     */

    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni String assign ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        String a = "Money";
        a = a + " More";

        //Mutable
        //StringBuilder kullanarak String uretmenin 1.Yolu:
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!?.

        //StringBuilder kullanarak String uretmenin 2.Yolu:
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir.
        //Kapasite asildiginda varolan kapasite nin iki fazlasi kadar varolan kapasiteye ekleme yapilir,
        // 16 ==> 16*2+2       -       34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//34*2+2 ==> 70

    }
}