package Constructor4;

import org.w3c.dom.ls.*;

public class Car4Demo {
    public static void main(String[] args) {
        Car4 object1 = new Car4();
        System.out.println(object1.speed);
        System.out.println(object1.color);
        System.out.println();

        Car4 object2 = new Car4(300);//As there is nothing in this Constructor's body, the print statement
        // takes the original values defined at the beginning.
        System.out.println(object2.speed);
        System.out.println(object2.color);
        System.out.println();

        Car4 object3 = new Car4("Yellow");
        System.out.println(object3.speed);
        System.out.println(object3.color);
        System.out.println();

        Car4 object4 = new Car4(500, "Pink");//No matter what you send here as a parameter, the print
        // statement will print the updated values (250 and Blue) that are in the constructor.
        System.out.println(object4.speed);
        System.out.println(object4.color);
    }

}
