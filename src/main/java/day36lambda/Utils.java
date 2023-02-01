package day36lambda;

import java.util.List;

public class Utils {
    //Lambda ile kod yazarken once Javanin bize verdigi methodlari method reference icinde kullanmamiz tavsiye edilir
    //Eger method reference yetmiyorsa Util Class a koyup oradan kullaniriz
    //Util tekrar tekrar kullanacagimiz methodlarda kullanilir. Surekli kullanmayacagimiz
    // methodlar kullanilarak Util i kalabaliklastirmak iyi degildir
    //Birseyi Util'e koydugumuzda bu herkesin isine yarayacak mi diye dusunmeliyiz!!

    public static int getLengthSquare(String s){
        return s.length()*s.length();
    }
    public static boolean isEven(String s){
        return s.length()%2==0;
    }
    public static String getLastChar(String s){
       return s.substring(s.length()-1);
    }
    public static void printInTheSameLineWithSpace(Object obj){
        System.out.println(obj + " ");
    }
}
