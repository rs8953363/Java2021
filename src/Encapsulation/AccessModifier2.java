package Encapsulation;

public class AccessModifier2 {
    public static void main(String[] args) {
        AccessModifier1 obj = new AccessModifier1();
        obj.acikString = "Bye";
        AccessModifier1.acikSayi = 50;
        // C01.sayi=15; private access modifier'i oldugundan baska class'dan erisilemez
        // obj.method1; private access modifier'i oldugundan baska class'dan erisil
        // C01 objParametreli= new C01(5); private access modifier'i oldugundan baska class'dan erisil
    }
    }
