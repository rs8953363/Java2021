package Constructor4;

public class Car3Demo {
    public static void main(String[] args) {

        Car3 object = new Car3();//This line calls the constructor and executes the print statement.

        System.out.println(object.model);//As this has been changed in constructor, the print statements takes the updated value.
        System.out.println(object.speed);//As this has been changed in constructor, the print statements takes the updated value.
        System.out.println(object.color);////As this has not been changed in constructor, the print statements takes the original value.
    }
}
