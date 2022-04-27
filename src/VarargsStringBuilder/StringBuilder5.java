package VarargsStringBuilder;

public class StringBuilder5 {
    public static void main(String[] args) {
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur
        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */
        StringBuilder3 sb1= new StringBuilder3("Ali Can");
        StringBuilder3 sb2= new StringBuilder3("Ali Can");
        String str= "Ali Can";
        System.out.println(sb1.compareTo(sb2)); // 0
        // System.out.println(sb1.compareTo(str));
        // SB'da equals methodu String'deki == gibi calisir
        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        System.out.println(sb1.equals(str)); // false
        // System.out.println(sb1==str); // farkli obje turleri oldugu icin java kiyas yapmaz
    }
}

