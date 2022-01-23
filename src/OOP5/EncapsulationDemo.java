package OOP5;

public class EncapsulationDemo {
    public static void main(String[] args) {
            Encapsulation object = new Encapsulation();

            int DOB = 1979;//Even if you change this variable it still prints out 1980 on th console. You cannot change
        // the value as it's private, and you don't use setter.
        System.out.println(object.getSubject());
        System.out.println(object.DOB());

    }
}
