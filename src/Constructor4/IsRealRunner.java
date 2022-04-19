package Constructor4;

public class IsRealRunner {
    public static void main(String[] args) {
        IsReal obj1= new IsReal("Emre", "Gulser", 44, true);
        System.out.println(obj1); // Isim : Emre, Soyisim : Gulser, numara : 44
        IsReal obj2=new IsReal("Emre", "Dh",55);
        System.out.println(obj2); // Isim : Emre, Soysim : Dh, numara : 55
        IsReal obj3=new IsReal("Ali","Can",50);
    }
}
