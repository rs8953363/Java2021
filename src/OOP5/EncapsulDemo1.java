package OOP5;

public class EncapsulDemo1 {
    public static void main(String[] args) {
        Encapsul1 object1 = new Encapsul1("Henry", 123123123l, 4500);
        Encapsul1 object2 = new Encapsul1("Barack", 23232323l, 4700);

        System.out.println(object1.name);
        System.out.println(object1.IDNumber);
    }
}
