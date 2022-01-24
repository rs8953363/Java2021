package OOP5;

import Objects3.*;

public class InheritancePriority5 {
    public static void main(String[] args) {

        Car object1 = new Car();//When you create an object by using Car class, it creates a default constructors in
        // Vehicle, Car, and Engine classes, and it runs the constructor in Vehicle class first.
        object1.start();
        object1.stop();

    }
}
