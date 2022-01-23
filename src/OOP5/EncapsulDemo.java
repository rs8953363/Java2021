package OOP5;

public class EncapsulDemo {
    public static void main(String[] args) {
        Encapsul object1 = new Encapsul("Henry", 123123123l, 4500);
        Encapsul object2 = new Encapsul("Barack", 23232323l, 4700);

        System.out.println(object1.name);
        System.out.println(object1.IDNumber);
    }
}
