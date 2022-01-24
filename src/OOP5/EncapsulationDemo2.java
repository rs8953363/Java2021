package OOP5;

import OOP4Principles.*;

public class EncapsulationDemo2 {
    public static void main(String[] args) {
            Encapsulation2 object = new Encapsulation2();

            int DOB = 1979;//Even if you change this variable it still prints out 1980 on th console. You cannot change
        // the value as it's private, and you don't use setter.
        System.out.println(object.getSubject());
        System.out.println(object.DOB());

    }
}
